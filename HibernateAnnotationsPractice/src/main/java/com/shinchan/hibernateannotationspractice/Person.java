/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shinchan.hibernateannotationspractice;
import javax.persistence.*;
import javax.persistence.OneToMany;
import java.util.List;
/**
 *
 * @author mnagdev
 */
@Entity
@Table(name="Person")
public class Person {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int roll;
private String name;
@OneToMany(cascade = CascadeType.ALL)
private List<Phone> phones;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }


}
