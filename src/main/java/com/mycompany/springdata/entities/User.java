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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="User"
    ,catalog="contactList"
)
public class User  implements java.io.Serializable {


     private Integer userId;
     private String username;
     private String userpass;
     private String userEmail;
     private String userPhone;
     private Set<ContactsInfo> contactsInfos = new HashSet<ContactsInfo>(0);

    public User() {
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", username=" + username + ", userpass=" + userpass + ", userEmail=" + userEmail + ", userPhone=" + userPhone + ", contactsInfos=" + contactsInfos + '}';
    }

	
    public User(String username, String userpass, String userEmail, String userPhone) {
        this.username = username;
        this.userpass = userpass;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
    }
    public User(String username, String userpass, String userEmail, String userPhone, Set<ContactsInfo> contactsInfos) {
       this.username = username;
       this.userpass = userpass;
       this.userEmail = userEmail;
       this.userPhone = userPhone;
       this.contactsInfos = contactsInfos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="userId", unique=true, nullable=false)
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    @Column(name="username", nullable=false, length=45)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="userpass", nullable=false, length=45)
    public String getUserpass() {
        return this.userpass;
    }
    
    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    
    @Column(name="userEmail", nullable=false, length=45)
    public String getUserEmail() {
        return this.userEmail;
    }
    
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    
    @Column(name="userPhone", nullable=false, length=45)
    public String getUserPhone() {
        return this.userPhone;
    }
    
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

@ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="contactList", catalog="contactList", joinColumns = { 
        @JoinColumn(name="userId", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="contactUserId", nullable=false, updatable=false) })
    public Set<ContactsInfo> getContactsInfos() {
        return this.contactsInfos;
    }
    
    public void setContactsInfos(Set<ContactsInfo> contactsInfos) {
        this.contactsInfos = contactsInfos;
    }




}


