package com.fullerton.olp.model.account;

import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Account.class)
public class Account_ {
	public static volatile SingularAttribute<Account, Long> id;
	public static volatile SingularAttribute<Account, String> name;
	public static volatile SingularAttribute<Account, String> username;
	public static volatile SingularAttribute<Account, Boolean> active;
	public static volatile SingularAttribute<Account, String> password;
	public static volatile SingularAttribute<Account, String> passwordToken;
	public static volatile SingularAttribute<Account, String> email;
	public static volatile SingularAttribute<Account, String> mobile;
	public static volatile SingularAttribute<Account, Role> role;
	public static volatile SingularAttribute<Account, Date> createdOn;
	public static volatile SingularAttribute<Account, String> createdBy;
	public static volatile SingularAttribute<Account, Date> modifiedOn;
	public static volatile SingularAttribute<Account, String> modifiedBy;
}
