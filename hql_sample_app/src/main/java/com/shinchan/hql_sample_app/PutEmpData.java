/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shinchan.hql_sample_app;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author mnagdev
 */

public class PutEmpData {
    
    
    public static void main(String args[]){
    List<Integer>list=new ArrayList<Integer>();
    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
                
    Emp e=new Emp();
    e.setName("Mayur");
    e.setSalary(50);
    Emp e1=new Emp();
    e1.setName("Ruwa");
    e1.setSalary(60);
    Emp e2=new Emp();
    e2.setName("Sonam");
    e2.setSalary(80);
    Emp e3=new Emp();
    e3.setName("Vinil");
    e3.setSalary(90);
    
    s.save(e);
    s.save(e1);
    s.save(e2);
    s.save(e3);
    t.commit();
    s.close();
    System.out.println("data has been saved!");
    }//main
    
}//class
