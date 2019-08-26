package com.cng.punishment.iu.controller;

import java.util.List;

import javax.validation.Valid;

import com.cng.punishment.entity.Car;
import com.cng.punishment.exception.NotFoundException;
import com.cng.punishment.iu.model.CarDto;
import com.cng.punishment.service.CarService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



/**
 * CarController
 */
@RestController
@RequestMapping("api/Car")
public class CarController {
    
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService=carService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarDto> getCar(@PathVariable("id")Long id) throws NotFoundException{
       return ResponseEntity.ok(carService.getCar(id));
    }

    @GetMapping("")
    public ResponseEntity<List<CarDto>> getCars() throws NotFoundException{
        return ResponseEntity.ok(carService.getCars());
    }

    @PostMapping(value="")
    public ResponseEntity<CarDto> saveCar(@Valid @RequestBody Car car) {
        return ResponseEntity.ok(carService.save(car));
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<CarDto> updateCar(@PathVariable Long id,@Valid @RequestBody Car car) {       
        return ResponseEntity.ok(carService.save(car));
    }

    @DeleteMapping("")
    public ResponseEntity<?> deleteCar(@PathVariable Long id){
        carService.Delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
    
}