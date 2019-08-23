package com.cng.punishment.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Employee
 */
@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseEntity {

    private static final long serialVersionUID = 5510252186567068589L;

    private String name;

    private String surname;

    private String tc;

    private String rutbe;
    
}