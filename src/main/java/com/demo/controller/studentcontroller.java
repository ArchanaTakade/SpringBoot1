package com.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.student;


@RestController
public class studentcontroller {
	
	
	@PostMapping("/std")
	public student addstudent(student stud) {
		//----------------
				return stud;
				
		}
	
	@GetMapping("/std/{rn}")
	public student getstudent(@PathVariable("rn")long rn) {
		student s1 = new student(1L,"nisha","patil","sangli");
		student s2 = new student(2L,"neha","chougule","pune");
		student s3 = new student(3L,"nisha","jain","gujarat");
		student s4 = new student(4L,"archana","shaha","rajasthan");
		
		List<student>student = Arrays.asList(s1,s2,s3);
   student s =null;
		for(student sample: student) {
			if(sample.getRollno()==rn) {
				s = sample;
			}
				return s;
			}
		
		return s;
		}
	
	
	@GetMapping("/msg")
	public List<student> getallstudents() {
		student s1 = new student(1L,"nisha","patil","sangli");
		student s2 = new student(2L,"neha","chougule","pune");
		student s3 = new student(3L,"nisha","jain","gujarat");
		student s4 = new student(4L,"archana","shaha","rajasthan");
		
		List<student>Students = Arrays.asList(s1,s2,s3,s4);
		
		return Students;
	}

}
