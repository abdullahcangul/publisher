package com.cng.punishment.iu.model;

import java.util.List;

import com.cng.punishment.entity.Punishment;

import lombok.Data;

/**
 * HumanDto
 */
@Data
public class HumanDto {

    private String name;

    private String surname;

    private String tc;

    private String tel;

    private String email;

    private List<Punishment> punishments;
    
}