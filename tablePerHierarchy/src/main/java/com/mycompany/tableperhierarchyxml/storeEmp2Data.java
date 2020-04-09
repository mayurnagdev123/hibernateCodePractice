/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.tableperhierarchyxml;

import net.bytebuddy.implementation.FieldAccessor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.apache.log4j.PropertyConfigurator;
/**
 *
 * @author mnagdev
 */

public class storeEmp2Data {
    
    
    public static void main(String mayur[])
    {
        PropertyConfigurator.configure("log4j.properties");
        Configuration cfg=new Configuration();
        cfg.configure("hibernate1.cfg.xml");//this cfg file must be in src/main/resources
        SessionFactory sf=cfg.buildSessionFactory();
        //SessionFactory is an interface that extends various interfaces like Serializable,Closeable,EntityManagerFactory
        Session s=sf.openSession();
        //Session too, is an interface that extends AutoCloseable,Closeable,HibernateEntityManager etc.
        Transaction t=s.beginTransaction();
//        Emp2 e2=new Emp2();
//        e2.setName("mayur");
        regEmp2 re2=new regEmp2();
        re2.setName("mayur");
        re2.setBonus(10);
        re2.setSalary(15000);
        
        conEmp2 ce2=new conEmp2();
        ce2.setName("sonam");
        ce2.setpay_Per_Hour(19);
        ce2.setContract_Duration("1 year");
        
        s.save(re2);
        s.save(ce2);
        t.commit();
        System.out.println("------------------------------------------------------------data Stored!!----------------------------");
        s.close();
        
        
    }//main
            }//class
