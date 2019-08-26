package com.cng.punishment.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Punishment
 */
@Entity
@Table(name = "punishment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Punishment {

    private String faturaNo;
    private String yer;
    private LocalDateTime FatureKesimTarihi;

    private Human human;

    private Car car;

    private Employee employee;

    private PunishmentType punishmentType;

}