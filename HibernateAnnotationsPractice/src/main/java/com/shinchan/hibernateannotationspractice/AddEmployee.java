/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shinchan.hibernateannotationspractice;

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
public class AddEmployee {
 
    
    public static void main(String args[]){
    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        Company c=new Company();
        c.setAddress("domlur,bangalore");
        c.setName("opentext");
        e1.setEmp_id(83589);
        e1.setEmp_name("mayur");
        e2.setEmp_id(84125);
        e2.setEmp_name("anurag");
        e3.setEmp_name("mallik");
        e3.setEmp_id(456789);
        List<Employee> list=new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        c.setEmployees(list);
    try{
    s.save(c);
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
    
}//class
