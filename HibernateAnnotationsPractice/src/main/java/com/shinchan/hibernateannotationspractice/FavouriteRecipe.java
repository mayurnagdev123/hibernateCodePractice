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
import javax.persistence.*;
@Entity
@Table(name="recipe")
public class FavouriteRecipe {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int r_id;
        private String recipeIngredients;
    private String recipeName;
    private String recipeID;

    
    @ManyToOne
    @JoinColumn(name="userID",referencedColumnName = "uaadhar")
    private User user_obj;
    
    public String getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(String recipeID) {
        this.recipeID = recipeID;
    }

    public String getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(String recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public User getUser_obj() {
        return user_obj;
    }

    public void setUser_obj(User user_obj) {
        this.user_obj = user_obj;
    }

    
    
    
}//class
