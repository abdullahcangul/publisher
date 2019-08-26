package com.cng.punishment.entity;

import java.util.List;

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
public class Human extends BaseEntity {

    private static final long serialVersionUID = 6506304641499878570L;

    private String name;

    private String surname;

    private String tc;

    private String tel;

    private String email;

    private List<Punishment> punishments;

    private List<Car> cars;
}