package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.bo.Student;
import com.example.demo.service.StudentService;
import com.example.demo.service.StudentServiceImpl;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	 public void setStudentService(StudentService service) {
		  this.service = service;
		 }
	@GetMapping(path = "/students")
	public List<Student> findAll()
	{
		return service.findAll();
	}
	@GetMapping(path = "/students75", produces = "application/json")
	public List<Student> findAllBySeventyFive()
	{
		return service.findAllBySeventyFive();
	}
	@GetMapping("/student/{id}")
	public Optional<Student> findStudent(@PathVariable int id)
	{
		return service.findById(id);
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student)
	{
		return service.save(student);
	}
}
