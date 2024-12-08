package com.example.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.starter.model.Employee;
import com.example.starter.service.EmployeeService;

@RestController
public class CrudController {
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return empService.saveEmployee(emp);
	}
	
	@PostMapping("/addEmployees")
	public List<Employee> addEmployee(@RequestBody List<Employee> emp) {
		return empService.saveAllEmployees(emp);
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> findTheEmployees(){
		return empService.findAllEmployees();
	}

	@GetMapping("/getEmployeeById/{id}")
	public Employee findById(@PathVariable Integer id){
		return empService.findEmployeeById(id);
	}
	
	@GetMapping("/getEmployeeByName/{name}")
	public List<Employee> findByName(@PathVariable String name){
		return empService.findEmployeeByName(name);
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deletebyId(@PathVariable Integer id) {
		return empService.deleteEmployee(id);
	}

	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return empService.updateEmployee(emp);
	}
	
	
	

}
