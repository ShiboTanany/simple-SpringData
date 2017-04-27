/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.springdata.daos;
import com.mycompany.springdata.entities.User;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author shibo
 */
public interface CrudRepositoryCustom extends JpaRepository<User, Integer>{
    
    
//    
//     List<User> findByEmail(String email);
//
//    List<User> findByDate(Date date);
//
//	// custom query example and return a stream
//    @Query("select c from Customer c where c.email = :email")
//    Stream<User> findByEmailReturnStream(@Param("email") String email);
}
