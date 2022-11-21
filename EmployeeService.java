package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements ServiceInterface {

	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee savestudent(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee) ;
	}

	@Override
	public Employee updatestudent(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}


	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);;
	}

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
	return (List<Employee>)employeeRepository.findAll();
	}
	

	
}