package io.javahome.DAO;

import java.util.List;

import io.javahome.model.Employee;


public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id); 
}
