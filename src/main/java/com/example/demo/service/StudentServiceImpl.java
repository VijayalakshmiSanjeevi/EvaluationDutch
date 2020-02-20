package com.example.demo.service;

import com.example.demo.bo.Student;
import com.example.demo.bo.Subject;
import com.example.demo.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repository;
    @Override
    public Student save(Student request) {
        return repository.save(request);
    }

    @Override
    public List<Student> findAll() {
    	List<Student> employees = (List<Student>) repository.findAll();
    	  return employees;
    }

    @Override
    public Optional<Student> findById(int id) {
        return repository.findById(id);
    }

	@Override
	public List<Student> findAllBySeventyFive() {
		// TODO Auto-generated method stub
		List<Student> students = (List<Student>) repository.findAll();
		List<Subject> subjects = new ArrayList<Subject>();
		List<Student> students75 = new ArrayList<Student>();
		for(Student s:students)
		{
			subjects = s.getSubjects();
			for(Subject u:subjects)
			{
				if(u.getMark() >75 && u.getSubjectName().equalsIgnoreCase("English"))
				{
					students75.add(s);
				}
			}
		}
		return students75;
	}
}
