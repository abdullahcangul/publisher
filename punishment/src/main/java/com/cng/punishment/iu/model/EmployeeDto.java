package com.cng.punishment.iu.model;

import java.util.List;

import com.cng.punishment.entity.Punishment;

import lombok.Data;

/**
 * EmployeeDto
 */
@Data
public class EmployeeDto {

    
    private String name;

    private String surname;

    private String email;

    private String tc;

    private String rutbe;

    private List<Punishment> punishments;
}