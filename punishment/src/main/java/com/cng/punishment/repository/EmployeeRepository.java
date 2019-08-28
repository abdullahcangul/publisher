package com.cng.punishment.repository;

import java.util.Optional;

import com.cng.punishment.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EmployeeRepository
 */
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

   Optional<Employee> findByEmail(String email);
   
}