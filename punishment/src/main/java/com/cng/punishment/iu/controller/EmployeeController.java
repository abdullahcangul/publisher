package com.cng.punishment.iu.controller;

import java.util.List;

import javax.validation.Valid;

import com.cng.punishment.entity.Employee;
import com.cng.punishment.exception.NotFoundException;
import com.cng.punishment.iu.model.EmployeeDto;
import com.cng.punishment.service.EmployeeService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EmployeeController
 */
@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService=employeeService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable("id")Long id) throws NotFoundException{
       return ResponseEntity.ok(employeeService.getEmployee(id));
    }

    @GetMapping("")
    public ResponseEntity<List<EmployeeDto>> getEmployees() throws NotFoundException{
        return ResponseEntity.ok(employeeService.getEmployees());
    }

    @PostMapping(value="")
    public ResponseEntity<EmployeeDto> saveEmployee(@Valid @RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.save(employee));
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable Long id,@Valid @RequestBody Employee employee) {       
        return ResponseEntity.ok(employeeService.save(employee));
    }

    @DeleteMapping("")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long id){
        employeeService.Delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}