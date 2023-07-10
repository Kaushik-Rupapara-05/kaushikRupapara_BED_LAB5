package com.emp.emps.service;

import java.util.Set;

import com.emp.emps.model.Employee;

public interface EmployeeService {
	
	Employee save(Employee employee);
	
	Set<Employee> fetchAll();
	
	Employee findById(long id);
	
	void deleteById(long id);
	
	
	Set<Employee> fetchEmployeesByName(String name);
	
	Set<Employee> fetchEmpByAgeGt(int age);

}
