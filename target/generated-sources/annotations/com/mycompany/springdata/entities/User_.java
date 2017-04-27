package com.mycompany.springdata.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, String> userpass;
	public static volatile SingularAttribute<User, String> userPhone;
	public static volatile SingularAttribute<User, String> userEmail;
	public static volatile SetAttribute<User, ContactsInfo> contactsInfos;
	public static volatile SingularAttribute<User, Integer> userId;
	public static volatile SingularAttribute<User, String> username;

}

