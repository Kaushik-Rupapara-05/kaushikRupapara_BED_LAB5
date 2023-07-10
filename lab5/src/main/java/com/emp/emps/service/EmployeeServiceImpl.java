package com.emp.emps.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.emps.dao.EmployeeRepository;
import com.emp.emps.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public Employee save(Employee employee) {
		return this.empRepository.save(employee);
	}

	@Override
	public Set<Employee> fetchAll() {
		//return Set.copyOf(this.empRepository.findAll());
		return new HashSet<>(this.empRepository.findAll());
	}

	@Override
	public Employee findById(long id) {
		return this.empRepository.findById(id).orElseThrow();
	}

	@Override
	public void deleteById(long id) {
		this.empRepository.deleteById(id);
	}

	@Override
	public Set<Employee> fetchEmployeesByName(String name) {
		return this.empRepository.findByNameLike(name);
	}

	@Override
	public Set<Employee> fetchEmpByAgeGt(int age) {
		return this.empRepository.findByAgeGreaterThanEqual(age);
	}

}
