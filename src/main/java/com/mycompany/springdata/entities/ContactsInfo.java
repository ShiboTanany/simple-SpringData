package com.mycompany.springdata.entities;
// Generated Apr 25, 2017 9:26:07 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * ContactsInfo generated by hbm2java
 */
@Entity
@Table(name="contactsInfo"
    ,catalog="contactList"
)
public class ContactsInfo  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String email;
     private String mobileNumber;
     private Set<User> users = new HashSet<User>(0);

    public ContactsInfo() {
    }

	
    public ContactsInfo(String name, String email, String mobileNumber) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }
    public ContactsInfo(String name, String email, String mobileNumber, Set<User> users) {
       this.name = name;
       this.email = email;
       this.mobileNumber = mobileNumber;
       this.users = users;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="name", nullable=false, length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="email", nullable=false, length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="mobileNumber", nullable=false, length=45)
    public String getMobileNumber() {
        return this.mobileNumber;
    }
    
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

@ManyToMany(fetch=FetchType.LAZY, mappedBy="contactsInfos")
    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }




}


