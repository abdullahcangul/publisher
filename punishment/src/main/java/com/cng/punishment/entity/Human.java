package com.cng.punishment.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Human
 */
@Entity
@Table(name = "human")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Human {

    private String name;

    private String surname;

    private String tc;

    

    
}