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
@Table(name="reg3")
@AttributeOverrides({
    @AttributeOverride(name="id",column=@Column(name="reg3Id")),
    @AttributeOverride(name="name",column=@Column(name="reg3Name"))
    
})
public class re3 extends Emp3 {
    
    private float Salary;
    private int bonus;
    
    public float getSalary() {
        return Salary;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    

    
}//class
