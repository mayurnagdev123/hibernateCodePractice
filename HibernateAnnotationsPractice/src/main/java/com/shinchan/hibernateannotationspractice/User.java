/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shinchan.hibernateannotationspractice;
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.Type;
/**
 *
 * @author mnagdev
 */
@Entity
@Table(name="userTable")
public class User {
    @Id
    
    @Column(name="uaadhar")
    private String aadhar;
    
    @Column(name="uname" )
    private String name;
   
  
    @Column(name="umobile",columnDefinition = "LONG")
   private long mobile;
//    
//    @OneToMany(cascade =CascadeType.ALL)
//    
//    private List<FavouriteRecipe> favouriteRecipe;
    
    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
 
    
    
}//class
