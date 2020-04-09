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
public class insertData {
    
    public static void main(String args[]){
    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory sf=cfg.buildSessionFactory();
    Session s=sf.openSession();
    Transaction t=s.beginTransaction();
 FavouriteRecipe fr=new FavouriteRecipe();
 fr.setRecipeID("1");
 fr.setRecipeIngredients("banana,milk");
 fr.setRecipeName("banana shake");
 User x=new User();
 x.setAadhar("613135184149");
 fr.setUser_obj(x);
 try{
 s.save(fr);
 t.commit();
 System.out.println("saved!!!--------------");
 }
 catch(Exception e)
 {
 e.printStackTrace();
 }
 finally{
 s.close();
 }
    
           
    
    
    }//main
    
    
}//class
