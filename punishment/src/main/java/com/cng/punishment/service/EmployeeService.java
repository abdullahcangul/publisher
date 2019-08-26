package com.cng.punishment.service;

import java.util.List;

import com.cng.punishment.entity.Employee;
import com.cng.punishment.exception.NotFoundException;
import com.cng.punishment.iu.model.EmployeeDto;

/**
 * EmployeeService
 */
public interface EmployeeService {

    public EmployeeDto getEmployee(Long id)  throws NotFoundException;
    public List<EmployeeDto> getEmployees();
    public EmployeeDto save(Employee employee);
    public EmployeeDto update(Employee employee,Long id)throws Exception;
    public void Delete(Long id);
}