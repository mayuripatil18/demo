package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("getAllEmployee")
	public List<Employee>getAllEmployee(){
		return employeeService.findAllEmployee();
		
	}
	//create a data
	@PostMapping("saveEmp")
	public Employee saveEmp(@RequestBody Employee employee) {
		employeeService.savestudent(employee);
		return employee;
	}
	//update data
	

    @PutMapping("updateEmployee")
     public Employee updateStudent(@RequestBody Employee employee ) {
	  employeeService.updatestudent(employee);
	   return employee;
	
  }
    
    @DeleteMapping("deleteEmployee")
    public String deleteEmployee(@RequestParam int id) {
		return "Employee deleted";
    	
    }
    }

	
	

