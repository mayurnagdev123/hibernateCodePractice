/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mypack.listmapping;

import javax.persistence.TypedQuery;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import java.util.List;
/**
 *
 * @author mnagdev
 */
public class FetchData {
    
    public static void main(String args[])
    {
    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory sf=cfg.buildSessionFactory();
    Session s=sf.openSession();
    Transaction t=s.beginTransaction();
        TypedQuery qr=s.createQuery("from Question");
        List<Question> results=qr.getResultList();//Execute a SELECT query and return the query results as a typed List.
        
        for(int i=0;i<results.size();i++)
        {
            Question q=results.get(i);
            String ques=q.getQname();
            List<String>answers=q.getAnswers();
            System.out.println(ques);
            for(String tmp:answers)
                System.out.println(tmp);
            System.out.println("------------------------------------------------------------------------------");
            
        }
    
    
    }//main
    
}//class
