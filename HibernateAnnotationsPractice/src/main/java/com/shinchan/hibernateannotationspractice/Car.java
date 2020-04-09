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
@Table(name="car")
public class Car {
    @Id
    private int registration_no;
    private String model;
    
    @ManyToOne
    
    private Owner owner;

    public int getRegistration_no() {
        return registration_no;
    }

    public void setRegistration_no(int registration_no) {
        this.registration_no = registration_no;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
            
    
}
