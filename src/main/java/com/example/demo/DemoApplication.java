package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bo.Student;
import com.example.demo.bo.Subject;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	StudentRepository repository;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
    	repository.save(new Student(1, "John",new Subject(1,"java",100)));
    	repository.save(new Student(2, "John1",new Subject(2,"C",100)));
    	repository.save(new Student(3, "John3",new Subject(3,".Net",100)));
    	repository.save(new Student(4,"Student1",new Subject(4,"English",100)));
		repository.save(new Student(5,"Student1",new Subject(5,"Maths",100)));
		repository.save(new Student(6,"Student3",new Subject(6,"English",70)));
		repository.save(new Student(7,"Student4",new Subject(7,"English",90)));
		repository.save(new Student(8,"Student5",new Subject(8,"English",100)));

    }
}
