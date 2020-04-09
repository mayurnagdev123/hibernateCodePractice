/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.concreteannotation;
import javax.persistence.*;
/**
 *
 * @author mnagdev
 */
@Entity
@Table(name="emp3Data")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Emp3 {
    
 @Id   
 @GeneratedValue(strategy = GenerationType.SEQUENCE)
 @Column(name="emp3_id")
    private int id;
 
 @Column(name="emp3Name")
    private String name;
    public void setName(String name)
    {
    this.name=name;
    }
    public String getName(){
    return name;
    }
    public void setId(int id)
    {
    this.id=id;
    }
    public int getId(){
    return id;
    }
    
    
}//class
