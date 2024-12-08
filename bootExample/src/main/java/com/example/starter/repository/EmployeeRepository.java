package com.example.starter.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.starter.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findByName(String name);

}
