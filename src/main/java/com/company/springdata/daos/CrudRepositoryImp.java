package com.company.springdata.daos;

import com.mycompany.springdata.entities.User;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shibo
 */
//@Configuration
//@EnableJpaRepositories(basePackages = {
//    "com.company.springdata.daos"
//})
//@EnableTransactionManagement
@Service("test")
public class CrudRepositoryImp {//implements CrudRepositoryCustom {

    @Autowired
    CrudRepositoryCustom crudRepositoryCustom;

//    public User save(User user) {
//        dao.save(user);
//        return user;
//    }
//    
    public CrudRepositoryCustom getDao() {
        return crudRepositoryCustom;
    }

    public void setDao(CrudRepositoryCustom dao) {
        this.crudRepositoryCustom = dao;
    }

//    @Override
//    public <S extends User> S save(S s) {
//
//        System.out.println("hellodsdjskjdksjdks");
//        crudRepositoryCustom.save(s);
//        return s;
//    }
//
//    @Override
//    public <S extends User> Iterable<S> save(Iterable<S> itrbl) {
//        crudRepositoryCustom.save(itrbl);
//        return itrbl;
//    }
//
//    @Override
//    public User findOne(Integer id) {
//        return crudRepositoryCustom.findOne(id);
//    }
//
//    @Override
//    public boolean exists(Integer id) {
//        return crudRepositoryCustom.exists(id);
//    }
//
//    @Override
//    public Iterable<User> findAll() {
//        return crudRepositoryCustom.findAll();
//    }
//
//    @Override
//    public Iterable<User> findAll(Iterable<Integer> itrbl) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public long count() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void delete(Integer id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void delete(User t) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void delete(Iterable<? extends User> itrbl) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void deleteAll() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
