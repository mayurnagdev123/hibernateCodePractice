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
@Table(name="con3")
@AttributeOverrides({
    @AttributeOverride(name="id",column=@Column(name="con3Id")),
    @AttributeOverride(name="name",column=@Column(name="con3Name"))
})
public class con3Emp extends Emp3{
    @Column(name="duration")
    private String duration;
    private int pay_per_hour;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getPay_per_hour() {
        return pay_per_hour;
    }

    public void setPay_per_hour(int pay_per_hour) {
        this.pay_per_hour = pay_per_hour;
    }
    
    
}//class
