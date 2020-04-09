/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shinchan.hql_sample_app;

import javax.persistence.TypedQuery;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author mnagdev
 */import java.util.*;


public class popEmpData {
    
    public static void main(String args[]){
    
     Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        
        TypedQuery q=s.createQuery("from Emp");
        List<Emp> list=q.getResultList();
        System.out.print("printing complete data----------\n");
        for(Emp tmp:list){
        System.out.print(tmp.getId()+"\t"+tmp.getName()+"\t"+tmp.getSalary()+"\n");
        }
        
        q.setFirstResult(0);
        q.setMaxResults(2);
        List<Emp>l2=q.getResultList();
        System.out.println("----------------printing only 2 records----------------------------");
        for(Emp tmp:l2){
        System.out.print(tmp.getId()+"\t"+tmp.getName()+"\t"+tmp.getSalary());
        }
        TypedQuery q1=s.createQuery("update Emp set name=:n where id=:i");//even thoughh the column name for the 'name' fiels 
        //is 'e_name' in the table, we have to use the variable that is defined in the class i.e 'name'
        q1.setParameter("n", "nagdev");
        q1.setParameter("i", 1);
        int rowsChanged=q1.executeUpdate();
        System.out.println("data has been modified!!!");
        TypedQuery q2=s.createQuery("select name from Emp where id=:i");
        q2.setParameter("i",1);
        String x=String.valueOf(q2.getSingleResult());
        System.out.println("Mayur has now been changed to:"+x);
        
        TypedQuery q3=s.createQuery("delete from Emp where id=5");
        int recordsChanged = q3.executeUpdate();
        
    TypedQuery q4=s.createQuery("select count(*) from Emp");
        List l3=q4.getResultList();
       // Object get = l3.get(0);
        System.out.println("count of employees is:"+l3.get(0));
        
   q=s.createQuery("select max(salary) from Emp");
   String maxSalary=String.valueOf(q.getSingleResult());
   System.out.println("the max salary is:"+maxSalary);//similarly average
   
   q=s.createQuery("select name from Emp where salary>70");
   List<String> l4=q.getResultList();
   System.out.println("printing the ones with the highest salaries!");
   for(String h:l4)
    System.out.print(h+"\t");
    
    TypedQuery tq=s.getNamedQuery("showEmpData");
    tq.setParameter("empName", "SoNaM");
    List<Emp>l5=tq.getResultList();
    Emp curr=l5.get(0);
    System.out.println(curr.getId()+"\t"+curr.getName()+"\t"+curr.getSalary());
    
    }//main
}//class
