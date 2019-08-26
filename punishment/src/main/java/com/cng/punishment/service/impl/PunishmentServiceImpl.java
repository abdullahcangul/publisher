package com.cng.punishment.service.impl;

import java.util.List;

import com.cng.punishment.entity.Punishment;
import com.cng.punishment.exception.NotFoundException;
import com.cng.punishment.iu.model.PunishmentDto;
import com.cng.punishment.repository.PunishmentRepository;
import com.cng.punishment.service.PunishmentService;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

/**
 * PunishmentServiceImpl
 */
@Service
public class PunishmentServiceImpl implements PunishmentService {


    private final PunishmentRepository punishmentRepository;
    private final ModelMapper modelMapper;

    public PunishmentServiceImpl(PunishmentRepository punishmentRepository,ModelMapper modelMapper) {
        this.punishmentRepository=punishmentRepository;
        this.modelMapper=modelMapper;
    }

    @Override
    public PunishmentDto getPunishment(Long id) throws NotFoundException {
        return modelMapper.map(
            punishmentRepository.findById(id).orElseThrow(()->new NotFoundException("Ceza bulunamıyor id="+id))
           ,PunishmentDto.class);
    }

    @Override
    public List<PunishmentDto> getPunishments() {
        return modelMapper.map(punishmentRepository.findAll()
        ,new TypeToken<List<PunishmentDto>>() {}.getType());
    }

    @Override
    public PunishmentDto save(Punishment punishment) {
        return modelMapper.map(punishmentRepository.save(punishment),PunishmentDto.class);
    }

    @Override
    public PunishmentDto update(Punishment punishment, Long id) throws Exception {
        return modelMapper.map(punishmentRepository.save(punishment)
        ,PunishmentDto.class);
    }

	@Override
	public void Delete(Long id) {
        punishmentRepository.deleteById(id);
	}
 
}