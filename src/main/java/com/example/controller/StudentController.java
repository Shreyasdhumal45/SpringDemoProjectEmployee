package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	//student/getdata
	@GetMapping("/getdata")
	public String getTest() {
		return "welcome in pune";
	}
	
	@GetMapping("/getStudent")
    public List<String> getStudentData() {
	List<String> list=new ArrayList();
	list.add("Rahul");
	list.add("pawar");
	list.add("pune");
	return list;
	}
	@GetMapping("/getStu")
	public Student getStudent() {
		
		return new Student();
	}
	
}
