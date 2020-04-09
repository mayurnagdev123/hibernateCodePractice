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
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Man")
public class Man {
 @Id
@Column(name="uaadhar")
    private String aadhar;
 @OneToMany(cascade = CascadeType.ALL)
 private List<Recipe> recipeList;

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(List<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

  

 
}
