package com.cng.punishment.repository;

import com.cng.punishment.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EmployeeRepository
 */
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    
}