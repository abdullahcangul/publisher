package com.cng.punishment.repository;

import com.cng.punishment.entity.Car;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CarRepository
 */
public interface CarRepository extends JpaRepository<Car,Long> {
    
}