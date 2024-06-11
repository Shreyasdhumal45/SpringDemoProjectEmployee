package com.example.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Serializable>{

	@Query(value= "select * from employee c where city=?1" , nativeQuery=true )
	public List<Employee> findByCity(String city);
	
	@Query(value= "select * from employee c where name=?1" , nativeQuery=true )
	public List<Employee> findByName(String name);
}
