/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mypack.listmapping;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author mnagdev
 */
public class StoreQuestion {
    
    public static void main(String args[]){

        Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory sf=cfg.buildSessionFactory();
    Session s=sf.openSession();
    
    Transaction t=s.beginTransaction();
    List<String>list=new ArrayList<>();
    list.add("my name is mayur");
    list.add("i am sonam");
    list.add("vinil here");
    Question q1=new Question();
    q1.setQname("What is your name?");
    q1.setAnswers(list);
    
    Question q2=new Question();
    q2.setQname("What do you love?");
List<String> l2=new ArrayList<String>();
l2.add("listening to music");
l2.add("dancing and yoga");
l2.add("playing cricket!");
        l2.add("playing chess");
        l2.add("exercising");
q2.setAnswers(l2);


s.save(q1);
s.save(q2);
t.commit();
s.close();


    System.out.println("-----------------------------data is stored!!!------------------");
    
    }//main
}//class
