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
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;
import javax.persistence.TypedQuery;
public class AddRecipe {
 Configuration cfg;
 SessionFactory sf;
 Session s;
 Transaction t;
    public AddRecipe(){
    cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    sf=cfg.buildSessionFactory();
    s=sf.openSession();
    t=s.beginTransaction();
    
    }
    
    public void insertRecipe(String recipe_id,String recipe_name,String recipe_URL,String aadhar){
   Man man=new Man();
   man.setAadhar(aadhar);
   Recipe recipe=new Recipe();
   recipe.setRecipe_URL(recipe_URL);
   recipe.setRecipe_id(recipe_id);
   recipe.setRecipe_name(recipe_name);
   List<Recipe>recipeList=new ArrayList<Recipe>();
           recipeList.add(recipe);
           man.setRecipeList(recipeList);
           try{
           s.save(man);
           t.commit();
           System.out.println("data has been saved!");
           }
           catch(Exception e){
           e.printStackTrace();
                   
           }
           finally{
           s.close();
           }
    }//func
  public void fetchRecipes(String aadhar){
    TypedQuery tq=s.createQuery("from Man m where m.aadhar=:a"); 
    tq.setParameter("a", aadhar);
    List<Man> resulList=tq.getResultList();
    System.out.println("printing result list:"+resulList);
    System.out.println("printing aadhar:"+resulList.get(0).getAadhar());
    for(Man m:resulList){
    List<Recipe>recipes=m.getRecipeList();
    for(Recipe r:recipes)
    {
    System.out.println(r.getRecipe_URL()+"\t"+r.getRecipe_id()+"\t"+r.getRecipe_name()+"\t"+aadhar);
    }
    }//for-each
  
  
  }//func
    
    public static void main(String mayur[]){
//AddRecipe ar=new AddRecipe();
//ar.insertRecipe("1234567","chicken curry!","www.myrecipes.com","7894561237");
AddRecipe ar2=new AddRecipe();
ar2.fetchRecipes("1234567");
        
        
    }

    
}//class
