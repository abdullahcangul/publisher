package com.cng.punishment.repository;

import com.cng.punishment.entity.Human;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * HumanRepository
 */
public interface HumanRepository extends JpaRepository<Human,Long> {

    
}