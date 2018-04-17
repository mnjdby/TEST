package com.fullerton.olp.model.account;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Transient;

import com.fullerton.olp.model.base.BaseModel;

/**
 * The persistent class for the account database table.
 * 
 */
@Entity
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
public class Account extends BaseModel<Long, Account> {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String name;
	
	private String username;
	
	private Boolean active;
	
	@Column(name="password")
	private String password;
	
	@Transient
	private String repassword;
	
	@Column(name="password_token")
	private String passwordToken;
	
	@Column(name="email_id")
	private String email;
	
	@Column(name="mobile")
	private String mobile;
	
	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;

	
	public Account(Account account) {
		super();
		this.id = account.getId();
		this.name = account.getName();
		this.username = account.getUsername();
		this.active = account.getActive();
		this.password = account.getPassword();
		this.passwordToken = account.getPasswordToken();
		this.email = account.getEmail();
		this.mobile = account.getMobile();
		this.role = account.getRole();
	}

	public Account() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getName() {
		return this.name;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getPasswordToken() {
		return passwordToken;
	}

	public void setPasswordToken(String passwordToken) {
		this.passwordToken = passwordToken;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedOn() {
		return this.modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public Account copy() {
		Account account = new Account();
		copyTo(account);
		return account;
	}

	@Override
	public void copyTo(Account account) {
		account.setId(getId());
		account.setActive(getActive());
		account.setName(getName());
		account.setUsername(getUsername());
		account.setEmail(getEmail());
		account.setMobile(getMobile());
		account.setPassword(getPassword());
		account.setPasswordToken(getPasswordToken());
		account.setRole(getRole());
	}
}