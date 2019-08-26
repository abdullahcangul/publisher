package com.cng.punishment.service.impl;

import java.util.List;

import com.cng.punishment.entity.Car;
import com.cng.punishment.exception.NotFoundException;
import com.cng.punishment.iu.model.CarDto;
import com.cng.punishment.repository.CarRepository;
import com.cng.punishment.service.CarService;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

/**
 * CarServiceImpl
 */
@Service
public class CarServiceImpl implements CarService {
    
    private final CarRepository carRepository;
    private final ModelMapper modelMapper;

    public CarServiceImpl(CarRepository carRepository,ModelMapper modelMapper) {
        this.carRepository=carRepository;
        this.modelMapper=modelMapper;
    }

    @Override
    public CarDto getCar(Long id) throws NotFoundException {
        return modelMapper.map(
            carRepository.findById(id).orElseThrow(()->new NotFoundException("Car bulunamadı id= "+id))
            ,CarDto.class);
    }

    @Override
    public List<CarDto> getCars() {
        return modelMapper.map(carRepository.findAll()
            ,new TypeToken<List<CarDto>>() {}.getType());
    }

    @Override
    public CarDto save(Car car) {
        return modelMapper.map(carRepository.save(car),CarDto.class);
    }

    @Override
    public CarDto update(Car car, Long id) throws Exception {
        if(car.getId()!=id)
        throw new Exception("Veri uyusmuyor");
        return modelMapper.map(carRepository.save(car),CarDto.class);
    }

	@Override
	public void Delete(Long id) {
        carRepository.deleteById(id);
	}
}