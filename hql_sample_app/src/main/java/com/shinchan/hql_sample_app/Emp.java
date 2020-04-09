/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.shinchan.hql_sample_app;

/**
 *
 * @author mnagdev
 */

import javax.persistence.*;


@NamedQueries({

@NamedQuery(
name="showEmpData",
        query = "from Emp where name=:empName"
)



})
@Entity
@Table(name="hql_sample")
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private int id;
    @Column(name="e_name")
    private String name;
    
    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}//class
