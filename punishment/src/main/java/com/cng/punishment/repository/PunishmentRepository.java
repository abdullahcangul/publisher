package com.cng.punishment.repository;

import com.cng.punishment.entity.Punishment;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * PunishmentRepository
 */
public interface PunishmentRepository extends JpaRepository<Punishment,Long> {

}