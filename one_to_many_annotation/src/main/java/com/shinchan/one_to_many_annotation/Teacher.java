package com.shinchan.one_to_many_annotation;
import java.util.List;
import javax.persistence.*;
@Entity
@Table(name="teacherData")
//one teacher teaches many students
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
   
//the referencing table(student) will have a column named t_id that will be the foreign key for the student table.
    //this foreign key will refer to the primary key of the parent(teacher) table
 ///   @OrderColumn(name="type")
   //Specifies a column that is used to maintain the persistent order of a list. 
//The persistence provider is responsible for maintaining the order upon retrieval and in the database
 //    @OneToMany(cascade = CascadeType.ALL,mappedBy="teacher_obj")
     //   @JoinColumn(name="teach_id", referencedColumnName = "id")
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "teacher_obj")
    private List<Student>students;

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    
}//class
