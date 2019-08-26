package com.cng.punishment.service.impl;

import java.util.List;

import com.cng.punishment.entity.Human;
import com.cng.punishment.exception.NotFoundException;
import com.cng.punishment.iu.model.HumanDto;
import com.cng.punishment.repository.HumanRepository;
import com.cng.punishment.service.HumanService;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

/**
 * HumanServiceImpl
 */
@Service
public class HumanServiceImpl implements HumanService {

    private final HumanRepository humanRepository;
    private final ModelMapper modelMapper;

    public HumanServiceImpl(HumanRepository humanRepository,ModelMapper modelMapper) {
        this.humanRepository=humanRepository;
        this.modelMapper=modelMapper;
    }

    @Override
    public HumanDto getHuman(Long id) throws NotFoundException {
        return modelMapper.map(
            humanRepository.findById(id).orElseThrow(()-> new  NotFoundException("Kullanıcı bulunamadı id= "+id))
            ,HumanDto.class);
    }

    @Override
    public List<HumanDto> getHumans() {
        return modelMapper.map(humanRepository.findAll()
        ,new TypeToken<List<HumanDto>>() {}.getType());
    }

    @Override
    public HumanDto save(Human human) {
        return modelMapper.map(humanRepository.save(human),HumanDto.class);
    }

    @Override
    public HumanDto update(Human human,Long id) throws Exception {
        if (human.getId()!=id)
            throw new Exception("Veri ile oynanmış");
        return modelMapper.map(humanRepository.save(human),HumanDto.class);
    }

    @Override
	public void Delete(Long id) {
        humanRepository.deleteById(id);
	}

    
}