/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mypack.listmapping;
import java.util.List;
/**
 *
 * @author mnagdev
 */
public class Question {
        
    private int id;
        private String qname;
    private List<String> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }
    public List getAnswers(){
    return this.answers;
    }
    public void setAnswers(List<String>  answers)
    {
    this.answers=answers;
    }
    
}//class
