package com.shinchan.one_to_many_annotation;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;
public class insertData{
 
    public static void main(String args[]){
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
    
        Teacher t1=new Teacher();
            t1.setName("khush");
            Teacher t2=new Teacher();
            t2.setName("heena");
            Student s1=new Student();
          //  s1.setRoll(28);
            s1.setS_name("veer");
            Student s2=new Student();
            //s2.setRoll(26);
            s2.setS_name("reyansh");
            Student s3=new Student();
           // s3.setRoll(13);
            s3.setS_name("aryan");
            Student s4=new Student();
           // s4.setRoll(25);
            s4.setS_name("hitharth");
            List<Student> l1=new ArrayList<Student>();
            l1.add(s1);
            l1.add(s2);
            
            List<Student> l2=new ArrayList<Student>();
            l2.add(s3);
            l2.add(s4);
            t1.setStudents(l1);
            t2.setStudents(l2);
            s1.setTeacher_obj(t1);
            s2.setTeacher_obj(t1);
            s3.setTeacher_obj(t2);
            s4.setTeacher_obj(t2);
            s.save(t1);
            s.save(t2);
            t.commit();
            s.close();
            System.out.println("-----data has beeen stored!!!-------------");
            
    }//main
}//class
