/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shinchan.hibernateannotationspractice;

/**
 *
 * @author mnagdev
 */
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
public class InsertCars {
    
public static void main(String args[]){
Car c=new Car();
c.setModel("Baleno Delta");
c.setRegistration_no(8989);

Owner owner=new Owner();
owner.setAadhar(61313518);
owner.setName("Mayur");
c.setOwner(owner);
Car c1=new Car();
c1.setModel("Celerio");
c1.setRegistration_no(7894);
c1.setOwner(owner);

Car c2=new Car();
c2.setModel("honda city");
c2.setRegistration_no(1234);
c2.setOwner(owner);

Configuration cfg=new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory sf=cfg.buildSessionFactory();
Session s=sf.openSession();
Transaction t=s.beginTransaction();
try{
    s.save(owner);
s.save(c);
s.save(c1);
s.save(c2);
t.commit();
System.out.println("Saved!!!!!!!!!!!!!!!!!!");
}
catch(Exception e){

System.out.println("error occured!");
e.printStackTrace();

}
finally{
s.close();
}
        

}

}


