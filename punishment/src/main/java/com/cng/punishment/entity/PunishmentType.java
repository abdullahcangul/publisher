package com.cng.punishment.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * PunishmentType
 */
@Entity
@Table(name = "punishment_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PunishmentType extends BaseEntity{

	private static final long serialVersionUID = 599611300084703243L;

    private String name;
    
    private int fiyat;

    private List<Punishment> punishments;
}