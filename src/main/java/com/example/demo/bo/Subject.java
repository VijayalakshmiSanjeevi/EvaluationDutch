package com.example.demo.bo;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "subjects_1")
public class Subject {
//
	@Id
	@GeneratedValue
    private int id;
    private String subjectName;
    private int mark;
    
    Subject()
    {
    	
    }
    public Subject(int id, String subjectName, int mark) {
        this.id = id;
        this.subjectName = subjectName;
        this.mark = mark;
    }
    @ManyToOne
    @JoinColumn
    private Student student;
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
