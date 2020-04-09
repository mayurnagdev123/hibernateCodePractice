/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tableperhierarchyxml;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.*;
/**
 *
 * @author mnagdev
 */
@Entity
@DiscriminatorValue("regEmp2")

public class regEmp2 extends Emp2{
    
    @Column(name="regEmpSalary")
    private float salary;
    
    @Column(name="regEmpBonus")
    private int bonus;
    
    public int getBonus(){
    return bonus;
    }
        
public void setBonus(int bonus)
{
this.bonus=bonus;
}
public void setSalary(float salary)
{
this.salary=salary;
}
public float getSalary(){
return salary;
}

}//class