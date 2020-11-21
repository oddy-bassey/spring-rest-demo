package com.revoltcode.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revoltcode.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	private List<Student> students;
	
	//define @postConstruct(called only once when this given bean is constructed) to load the student data!
	@PostConstruct
	public void loadData() { 
		
		students = new ArrayList<Student>();
		students.add(new Student("Emman", "Bassey"));
		students.add(new Student("Emily", "Bassey"));
		students.add(new Student("Jerry", "Bassey"));
	}

	//define endpoint for "/students"
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return students;	
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		if(studentId >= students.size() || studentId < 0) {
			throw new StudentNotFoundException("student not found -"+studentId);
		}
		//index into the list
		return students.get(studentId);
	}	
}
