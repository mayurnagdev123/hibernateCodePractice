/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shinchan.one_to_many_annotation;

import java.util.Arrays;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author mnagdev
 */
import java.util.List;
public class retrieveData {
    
    public static void main(String ar[]){
    
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        TypedQuery tq=s.createQuery("from Teacher");
        List<Teacher> results=tq.getResultList();
    for(int i=0;i<results.size();++i)
    {
    Teacher ob=results.get(i);
    System.out.println(ob.getName());
    List<Student>studentList=ob.getStudents();
    for(Student x:studentList)
        System.out.print(x.getS_name()+"\t");
    System.out.println("####################################");
    }
    
    }//main
    
    
    
}//class
