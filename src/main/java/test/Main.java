package test;

import com.company.springdata.daos.CrudRepositoryImp;

import com.mycompany.springdata.entities.User;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.hibernate.HibernateException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shibo
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext app = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
        System.out.println("read successfuly");

        CrudRepositoryImp user = (CrudRepositoryImp) app.getBean("test");
        System.out.println("user is    " + user);
        System.out.println("" + user.getDao().save(new User("asmaas", "sds", "dsds", "dsddskd")));
        Iterable<User> x= user.getDao().findAll();
        for (User x1 : x) {
            System.out.println(""+x1);
        }

    }
}
