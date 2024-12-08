package com.example.starter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.starter.model.Employee;
import com.example.starter.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;
	
	public Employee saveEmployee(Employee emp) {
		return empRepository.save(emp);
	}
	
	public List<Employee> saveAllEmployees(List<Employee> empList){
		return empRepository.saveAll(empList);
	}
	
	public List<Employee> findAllEmployees(){
		return empRepository.findAll();
	}
	
	public Employee findEmployeeById(Integer id){
		return empRepository.findById(id).orElse(null);
	}
	
	public List<Employee> findEmployeeByName(String name){
		return empRepository.findByName(name);
	}
	
	public String deleteEmployee(Integer id) {
			empRepository.deleteById(id);
			return "Delete Success";
	}
	
	public Employee updateEmployee(Employee emp) {
		Employee existingEmp = empRepository.findById(emp.getId()).orElse(null);
		existingEmp.setName(emp.getName());
		existingEmp.setPosition(emp.getPosition());
		existingEmp.setSalary(emp.getSalary());
		
		return empRepository.save(existingEmp);
	}

}
