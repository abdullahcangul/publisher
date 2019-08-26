package com.cng.punishment.service;

import java.util.List;

import com.cng.punishment.entity.Car;
import com.cng.punishment.exception.NotFoundException;
import com.cng.punishment.iu.model.CarDto;

/**
 * CarService
 */
public interface CarService {

    public CarDto getCar(Long id)  throws NotFoundException;
    public List<CarDto> getCars();
    public CarDto save(Car car);
    public CarDto update(Car car,Long id)throws Exception;
    public void Delete(Long id);
}