package com.cng.punishment.iu.model;

import java.util.List;

import com.cng.punishment.entity.Punishment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CarDto
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {

    private String plaka;

    private String renk;

    private String modelYili;

    private String saseNo;

    private String motorNo;

    private List<Punishment> punishments;

    private HumanDto human;
    
}