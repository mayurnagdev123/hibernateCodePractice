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
@Table(name="Company")
public class Company {
@Id
private String address;
private String name;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(referencedColumnName = "address", name = "works_at")
private List<Employee> employees;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }




}
