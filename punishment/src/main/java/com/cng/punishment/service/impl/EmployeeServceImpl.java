package com.cng.punishment.service.impl;

import java.util.List;

import com.cng.punishment.entity.Employee;
import com.cng.punishment.exception.NotFoundException;
import com.cng.punishment.iu.model.EmployeeDto;
import com.cng.punishment.iu.model.LoginResponse;
import com.cng.punishment.repository.EmployeeRepository;
import com.cng.punishment.service.EmployeeService;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

/**
 * EmployeeServceImpl
 */
@Service
public class EmployeeServceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeServceImpl(EmployeeRepository employeeRepository,ModelMapper modelMapper) {
        this.employeeRepository=employeeRepository;
        this.modelMapper=modelMapper;
    }

    @Override
    public EmployeeDto getEmployee(Long id) throws NotFoundException {
        return  modelMapper.map(
            employeeRepository.findById(id).orElseThrow(()->new NotFoundException("Employee bulunamıyor id="+id))
            ,EmployeeDto.class);
    }

    @Override
    public List<EmployeeDto> getEmployees() {
        return modelMapper.map(employeeRepository.findAll()
            ,new TypeToken<List<EmployeeDto>>() {}.getType());
    }

    @Override
    public EmployeeDto save(Employee employee) {
        return modelMapper.map(employeeRepository.save(employee)
            ,EmployeeDto.class);
    }

    @Override
    public EmployeeDto update(Employee employee, Long id) throws Exception {
        if(employee.getId()!=id)
            throw new Exception("Veri uyusmuyor");
        return modelMapper.map(employeeRepository.save(employee)
            ,EmployeeDto.class);
    }

	@Override
	public void Delete(Long id) {
        employeeRepository.deleteById(id);
	}


    @Override
    public LoginResponse login(String email,String passwod) {
        Employee employee=employeeRepository.findByEmail(email).orElseThrow();
        if(passwod.equals(employee.getPassword())){
            return new LoginResponse(Boolean.TRUE,employee); 
        }
        return new LoginResponse(Boolean.FALSE,employee); 
        
    }

    
}