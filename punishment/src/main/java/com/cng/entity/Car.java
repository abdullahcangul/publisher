package com.cng.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Car
 */
@Entity
@Table(name = "car")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car extends BaseEntity {

    private static final long serialVersionUID = -6120555270201391428L;

    private String plaka;

    private String renk;

    private String modelYili;

    private String saseNo;

    private String motorNo;
}