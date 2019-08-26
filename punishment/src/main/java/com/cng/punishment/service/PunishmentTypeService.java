package com.cng.punishment.service;

import java.util.List;

import com.cng.punishment.entity.PunishmentType;
import com.cng.punishment.exception.NotFoundException;

/**
 * PunishmentTypeService
 */
public interface PunishmentTypeService {

    public PunishmentType getPunishmentType(Long id)  throws NotFoundException;
    public List<PunishmentType> getPunishmentTypes();
    public PunishmentType save(PunishmentType punishmentType);
    public PunishmentType update(PunishmentType punishmentType,Long id)throws Exception;
    public void Delete(Long id);
}