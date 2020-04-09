/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.concreteannotation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author mnagdev
 */
public class StoreInfo {
    
    
    public static void main(String args[])
    {
//        Emp3 ob=new Emp3();
//        String h=ob.getName();
//        System.out.println(ob.name);
    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory sf=cfg.buildSessionFactory();
    Session s=sf.openSession();
    Transaction t=s.beginTransaction();
    Emp3 e3=new Emp3();
    e3.setId(108);
    e3.setName("mayur");    
    re3 r3=new re3();
    r3.setName("sonam");
    r3.setSalary(50000);
    r3.setBonus(10000);
    con3Emp con3=new con3Emp();
    con3.setName("vinil");
    con3.setDuration("6 months");
    con3.setPay_per_hour(15000);
    
    s.save(e3);
    s.save(r3);
    s.save(con3);
    t.commit();
    s.close();
    System.out.println("-------------------------------------------data has been stored!!!!---------------------------------------------------------");
    
    
    }
}//class
