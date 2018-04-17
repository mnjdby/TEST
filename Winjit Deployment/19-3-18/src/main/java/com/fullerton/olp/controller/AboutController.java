package com.fullerton.olp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {
	@Autowired
	JdbcTemplate jdbc;


	 @RequestMapping( value = "/about_us", method = RequestMethod.GET, produces = "text/json") 
	    
	    public String about_us()
	    
	    { // System.out.println(customer.toString()); 
		    SqlRowSet set = jdbc.queryForRowSet("select text from about_us"); 
		    int rowCount = 0;
		    while (set.next())
	    	
			    { 
			    	System.out.println("about us text :"+set.getString("text")); 
			    	set.getString("text");
			    	return "{ \"about_us_text\":\""+set.getString("text")+"\"}"; 
			    
			    }
		    
	    	return "";
	    

}
}
