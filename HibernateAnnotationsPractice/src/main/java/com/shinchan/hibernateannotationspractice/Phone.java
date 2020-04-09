/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shinchan.hibernateannotationspractice;

import javax.persistence.GeneratedValue;
import javax.persistence.*;
import org.hibernate.annotations.ColumnDefault;
@Entity
@Table(name="Phone")
public class Phone {
@Id
@ColumnDefault("1")
    private int mobile;


    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }


    
}
