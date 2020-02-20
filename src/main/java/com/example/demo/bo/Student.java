package com.example.demo.bo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.*;

import javax.validation.constraints.NotNull;
@Entity
@Table(name = "students_1")
public class Student {

	@Id
	@GeneratedValue
    private int id;
	@Column
    private String fullName;
	@OneToMany(mappedBy="student", cascade = CascadeType.ALL)
    private List<Subject> subjects;

    public Student(int id, String fullName,Subject...subjects) {
        this.id = id;
        this.fullName = fullName;
        this.subjects = Stream.of(subjects).collect(Collectors.toList());
        this.subjects.forEach(x -> x.setStudent(this));
    }
    Student()
    {
    	
    }
    @NotNull
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
   
    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
