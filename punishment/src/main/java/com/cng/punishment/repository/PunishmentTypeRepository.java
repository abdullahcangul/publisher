package com.cng.punishment.repository;

import com.cng.punishment.entity.PunishmentType;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * PunishmentTypeRepository
 */
public interface PunishmentTypeRepository extends JpaRepository<PunishmentType,Long> {

    
}