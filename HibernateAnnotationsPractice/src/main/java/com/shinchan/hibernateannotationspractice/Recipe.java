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
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Recipe")
public class Recipe {
        @Id

    private String recipe_id;
    private String recipe_name;
    private String recipe_URL;
    
   

    public String getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(String recipe_id) {
        this.recipe_id = recipe_id;
    }

    public String getRecipe_name() {
        return recipe_name;
    }

    public void setRecipe_name(String recipe_name) {
        this.recipe_name = recipe_name;
    }

    public String getRecipe_URL() {
        return recipe_URL;
    }

    public void setRecipe_URL(String recipe_URL) {
        this.recipe_URL = recipe_URL;
    }


}
