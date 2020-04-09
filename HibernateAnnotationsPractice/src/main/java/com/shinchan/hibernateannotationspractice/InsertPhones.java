/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shinchan.hibernateannotationspractice;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;
/**
 *
 * @author mnagdev
 */
public class InsertPhones {
    
    public static void main(String args[]){
    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        Person p=new Person();
       // p.setRoll(1);
        p.setName("sonam");
Phone p1=new Phone();
p1.setMobile(97396);;
    List<Phone> phones=new ArrayList<Phone>();
    phones.add(p1);

    p.setPhones(phones);
    
    try{
    s.save(p);
    t.commit();
    System.out.println("data has been saved!----------------------");
    }
    catch(Exception e){
    System.out.println("error:");
    e.printStackTrace();
    }
    finally{
    s.close();
    }
    
    }//main    
}
