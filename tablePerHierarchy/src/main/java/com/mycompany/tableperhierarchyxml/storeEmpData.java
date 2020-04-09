/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.tableperhierarchyxml;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author mnagdev
 */
public class storeEmpData {
    
    public static void main(String...args){
    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    
    SessionFactory sf=cfg.buildSessionFactory();
Session s=sf.openSession();
Transaction t=s.beginTransaction();
Employee e1=new Employee();
e1.setName("Mayur");

Regular_Employee re=new Regular_Employee();
re.setName("Sonam");
re.setBonus(500000);
re.setSalary(1300000);

Contract_Employee ce=new Contract_Employee();
ce.setName("Vinil");
ce.setContract_duration("6 months");
ce.setPay_per_hour(3000);
s.save(e1);
s.save(re);
s.save(ce);
t.commit();
System.out.println("data has been stored");

s.close();



    }//main
    
    
    
}//class
