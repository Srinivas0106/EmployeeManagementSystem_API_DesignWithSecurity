package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employees;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employees, Integer>{

}
