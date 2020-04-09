/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.tableperhierarchyxml;
import javax.persistence.*;
/**
 *
 * @author mnagdev
 */
@Entity
@DiscriminatorValue("conEmp2")
public class conEmp2 extends Emp2 {
    //if this class does not inherit any parent then an id will have to be specified explicitly
    //An entity or IdClass class should implement the java.io.Serializable interface(the error)
    @Column(name="conEmpDuration")
    private String contract_duration;
    
    @Column(name="conEmpHourlyPay")
    private float pay_per_hour;
    
    public void setContract_Duration(String contract_duration)
    {
    this.contract_duration=contract_duration;
    }
    
    public String getContract_Duration(){
    return this.contract_duration;
    }
    
    public float getPay_Per_Hour(){
    return pay_per_hour;
    }
    public void setpay_Per_Hour(float pay_per_hour)
    {
    this.pay_per_hour=pay_per_hour;
    }
}//class
