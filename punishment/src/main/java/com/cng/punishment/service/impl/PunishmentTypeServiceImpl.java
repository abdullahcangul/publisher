package com.cng.punishment.service.impl;

import java.util.List;

import com.cng.punishment.entity.PunishmentType;
import com.cng.punishment.exception.NotFoundException;
import com.cng.punishment.repository.PunishmentTypeRepository;
import com.cng.punishment.service.PunishmentTypeService;

import org.springframework.stereotype.Service;

/**
 * PunishmentTypeServiceImpl
 */
@Service
public class PunishmentTypeServiceImpl implements PunishmentTypeService {

    private final PunishmentTypeRepository punishmentTypeRepository;

    public PunishmentTypeServiceImpl(PunishmentTypeRepository punishmentTypeRepository) {
        this.punishmentTypeRepository=punishmentTypeRepository;
    }

    @Override
    public PunishmentType getPunishmentType(Long id) throws NotFoundException {
        return punishmentTypeRepository.findById(id).orElseThrow(()->new NotFoundException("Ceza Turu bulunamıyor id="+id));
    }

    @Override
    public List<PunishmentType> getPunishmentTypes() {
        return punishmentTypeRepository.findAll();
    }

    @Override
    public PunishmentType save(PunishmentType punishmentType) {
        return punishmentTypeRepository.save(punishmentType);
    }

    @Override
    public PunishmentType update(PunishmentType punishmentType, Long id) throws Exception {
        if(punishmentType.getId()==id)
            throw new Exception("id'ler uyusmuyor");
        return punishmentTypeRepository.save(punishmentType);
    }

	@Override
	public void Delete(Long id) {
        punishmentTypeRepository.deleteById(id);
	}
}