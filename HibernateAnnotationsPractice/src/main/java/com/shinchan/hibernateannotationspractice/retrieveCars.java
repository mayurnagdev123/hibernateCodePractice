/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shinchan.hibernateannotationspractice;

import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author mnagdev
 */
public class retrieveCars {
    
    public static void main(String args[]){
Configuration cfg=new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory sf=cfg.buildSessionFactory();
Session s=sf.openSession();
Transaction t=s.beginTransaction();
try{
    TypedQuery tq=s.createQuery("from Car");
    List<Car> carsList=tq.getResultList();
for(Car car:carsList)
{
System.out.println(car.getRegistration_no()+"\t"+car.getModel()+"\t");
Owner owner=car.getOwner();
System.out.println(owner.getAadhar()+"\t"+owner.getName());
}
}//try
catch(Exception e){}
    
    }//main
}//class