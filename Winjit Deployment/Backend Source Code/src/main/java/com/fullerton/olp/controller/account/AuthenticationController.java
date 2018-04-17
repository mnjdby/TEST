package com.fullerton.olp.controller.account;

import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.persistence.EntityExistsException;
import javax.validation.Valid;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fullerton.olp.controller.BaseController;
import com.fullerton.olp.model.EmailTemplate;
import com.fullerton.olp.model.account.Account;
import com.fullerton.olp.service.EmailTemplateService;
import com.fullerton.olp.service.account.AccountService;
import com.fullerton.olp.settings.email.SmtpMailSender;
import com.fullerton.olp.settings.email.TemplateService;

/**
 * This controller is responsible to manage the authentication
 * system. Login - Register - Forgot password - Account Confirmation
 */
@RestController
public class AuthenticationController extends BaseController{

	@Value("${web.host}")
	private String WEB_HOST;
	
    @Autowired
    protected AuthenticationManager authenticationManager;

    @Autowired
    private AccountService accountService;
    
    @Autowired
    private SmtpMailSender smtpMailSender;
    
    @Autowired
    private TemplateService templateService;
    
    @Autowired
    private EmailTemplateService emailTemplateService;
    
    

    //@RequestMapping(value="/api/account",  consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Account getAccount(String username){
    	Account account = accountService.findByUsername(username);
    	//send only required params
        return account;
    }
    
    //@RequestMapping(value="/api/accountid", method=RequestMethod.GET)
    public @ResponseBody Long getLoggedInAccountId(){
        return getLoggedInUserAccountId();
    }
    

    /**
     * Create a new user account
     * @param account user account
     * @return created account as json
     */
    //@RequestMapping(value="/register", method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Account> register(@Valid @RequestBody Account account, BindingResult errors){

        // Check if account is unique
    	if(errors.hasErrors()){
    		return new ResponseEntity<Account>(new Account(), HttpStatus.FORBIDDEN);
        }
        
    	Account createdAccount = accountService.createNewAccount(account);
    	Map<String, String> data = new HashMap<>();
		data.put("userName", account.getEmail().toUpperCase());
    	Thread r = new Thread() {
			@Override
			public void run() {
    				//send notification //add event calendar
    				String formattedText = templateService.getFormattedText("template/email/Registration.vm", data);
    				try {
    					smtpMailSender.send(account.getEmail(), "Welcome to Fullerton Family!", formattedText);
    				} catch (MessagingException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    			}
    		};
    		r.start();
    		
        return new ResponseEntity<Account>(createdAccount, HttpStatus.CREATED);
    }

    @RequestMapping(value="/newpassword", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> setNewPassword( @RequestBody Account account) throws MessagingException {
    	
			Account dbAccount = accountService.findByUsername(account.getEmail());
			if(dbAccount.getPasswordToken().equals(account.getPasswordToken())) {
				dbAccount.setPassword(new BCryptPasswordEncoder().encode(account.getPassword()));
				dbAccount.setPasswordToken("");
				accountService.save(dbAccount);
    			String response = "{success: true}";
	            
				Thread r = new Thread() {
	    			@Override
	    			public void run() {
    	    				//send notification //add event calendar
    	    				String formattedText = templateService.getFormattedText("template/email/PasswordChanged.vm", new HashMap<>());
    	    				try {
    	    					smtpMailSender.send(account.getEmail(), "Fullerton - Your password changed successfully", formattedText);
    	    				} catch (MessagingException e) {
    	    					// TODO Auto-generated catch block
    	    					e.printStackTrace();
    	    				}
    	    			}
    	    		};
    	    		r.start();
    	    		return new ResponseEntity<String>(response, HttpStatus.OK);
			} else {
				String response = "{success: false}";
				return new ResponseEntity<String>(response, HttpStatus.FORBIDDEN);
			}
    }
    
    @RequestMapping(value="/forgotPassword", method=RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> forgotPassword(@RequestParam(value="username") String username) throws MessagingException {
    		Account account = accountService.findByUsername(username);
    	
	    	if(account == null){
	    		String response = "{success: false}";
	    		return new ResponseEntity<String>(response, HttpStatus.NOT_FOUND);
	    	}else {
	    		String passwordCode = RandomStringUtils.random(99, true, true);
	    		account.setPasswordToken(passwordCode);
	    		accountService.save(account);
	    		Map<String, String> data = new HashMap<>();
	    		data.put("link", WEB_HOST + "reset?username="+username+ "&passwordToken="+passwordCode);
	
	    		Thread r = new Thread() {
	    			@Override
	    			public void run() {
	    				EmailTemplate resetPasswordTemplate = emailTemplateService.findById(1l);
	    				String formattedText = templateService.getFormattedText(resetPasswordTemplate, data);
	    				try {
	    					smtpMailSender.send(account.getEmail(), "Fullerton - Reset your password", formattedText);
	    				} catch (MessagingException e) {
	    					// TODO Auto-generated catch block
	    					e.printStackTrace();
	    				}
	    			}
	    		};
	    		r.start();
	    		String response = "{success: true}";
	            return new ResponseEntity<String>(response, HttpStatus.OK);
	    	}
    }

    @RequestMapping(value = "/changePassword", method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> changePassword(@RequestBody Account account/*, BindingResult bindingResult*/) {
    	
    	if(StringUtils.isBlank(account.getPassword()) || StringUtils.isBlank(account.getRepassword()) || ! account.getPassword().equals(account.getRepassword())) {
    		//bindingResult.addError( new ObjectError("password", "Please enter same passwords in both text boxes"));
    		return changePassword(account); 
    	}
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	Account _account = accountService.findByUsername(auth.getPrincipal().toString());
    	// Validate the password
        if (account.getRepassword().length() < 8){
            throw new EntityExistsException("Password should be greater than 8 characters");
        }

        // Encode the password
        _account.setPassword(new BCryptPasswordEncoder().encode(account.getRepassword()));
    	accountService.save(_account);
    	
    	String response = "{success: true}";
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}
