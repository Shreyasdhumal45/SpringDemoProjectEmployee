package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	
	public Optional<Employee> getEmployeeById(Integer Id);
	
    public void	deleteEmployee(Integer Id);
    
    public List<Employee> getListByCity(String city);
    public List<Employee> getListByName(String name);
    
   

}
