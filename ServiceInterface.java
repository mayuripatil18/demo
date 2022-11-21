package com.example.demo;

import java.util.List;

public interface ServiceInterface {
public Employee savestudent(Employee employee);
	
	
	//To update student
	public Employee updatestudent(Employee employee);
	
	//find all the student from database
	
	public List<Employee> findAllEmployee(); 
	
	//To delete student
	
	public void deleteEmployee(int id);

}
