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
public class retrieveEmployees {
    
    public static void main(String args[]){
Configuration cfg=new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory sf=cfg.buildSessionFactory();
Session s=sf.openSession();
Transaction t=s.beginTransaction();
try{
    TypedQuery tq=s.createQuery("from Company");
    List<Company> companyList=tq.getResultList();
for(Company company:companyList)
{
System.out.println(company.getAddress()+"\t"+company.getName());
List<Employee> employeeList=company.getEmployees();
for(Employee x:employeeList)
    System.out.println(x.getEmp_id()+"\t"+x.getEmp_name());
}//for
}//try
catch(Exception e){
e.printStackTrace();
}
    
    }//main
}//class