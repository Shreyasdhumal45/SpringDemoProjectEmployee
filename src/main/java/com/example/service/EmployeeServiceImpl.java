package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeRepository;
import com.example.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
				
		return employeeRepository.save(employee);
		

	}

	@Override
	public Optional<Employee> getEmployeeById(Integer Id) {
		//Employee employee1=employeeRepository.findById(Id);
		Optional<Employee> employee=	employeeRepository.findById(Id);
		
		return employee;
	}

	@Override
	public void deleteEmployee(Integer Id) {
		
		employeeRepository.deleteById(Id);
	}

	@Override
	public List<Employee> getListByCity(String city) {
		List<Employee> list=employeeRepository.findByCity(city);
		return list;
	}

	@Override
	public List<Employee> getListByName(String name) {
		List<Employee> list=employeeRepository.findByName(name);
		return list;
	}

	

}
