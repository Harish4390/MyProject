package io.javahome.service;

import java.util.List;

import io.javahome.model.Employee;


public interface EmployeeService {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id); 
}
