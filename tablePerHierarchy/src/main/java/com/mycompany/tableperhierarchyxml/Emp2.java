/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.tableperhierarchyxml;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author mnagdev
 */

    @Entity
    @Table(name="singleHierarchyAnno")
    @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
    @DiscriminatorColumn(name="emp2_type",discriminatorType = DiscriminatorType.STRING)
    @DiscriminatorValue(value="emp2")
public class Emp2 {
        @Id
@GeneratedValue(strategy=GenerationType.AUTO)
        
        @Column(name="emp2_id")
        private int id;
    /*
        In a programming context, a build is a version of a program. As a rule, a build is a pre-release version and as such is identified by a build number, 
        rather than by a release number. Reiterative (repeated) builds are an important part of the development process. Throughout development,
        application components are collected and repeatedly compiled for testing purposes, 
        to ensure a reliable final product. Build tools, such as make or Ant, enable developers to automate some programming tasks.
        
        */
    
    @Column(name="emp2Name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}//class
