package com.mycompany.springdata.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ContactsInfo.class)
public abstract class ContactsInfo_ {

	public static volatile SingularAttribute<ContactsInfo, String> mobileNumber;
	public static volatile SingularAttribute<ContactsInfo, String> name;
	public static volatile SingularAttribute<ContactsInfo, Integer> id;
	public static volatile SingularAttribute<ContactsInfo, String> email;
	public static volatile SetAttribute<ContactsInfo, User> users;

}

