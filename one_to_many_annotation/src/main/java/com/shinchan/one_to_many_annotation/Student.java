package com.shinchan.one_to_many_annotation;
import javax.persistence.*;
@Entity
@Table(name="studentData")
public class Student {
@Id
@Column(name="s_id")
    //Provides for the specification of generation strategies for the values of primary keys.
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int roll;
 private String s_name;
 @ManyToOne
 @JoinColumn(name="she_teaches_me")
 
 //if @JoiinColumn is not specified, then the name of the column created will be teacher_obj_id
   private Teacher teacher_obj;

    public Teacher getTeacher_obj() {
        return teacher_obj;
    }

    public void setTeacher_obj(Teacher teacher_obj) {
        this.teacher_obj = teacher_obj;
    }
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }
    
    
}//class
