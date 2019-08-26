package com.cng.punishment.service;

import java.util.List;

import com.cng.punishment.entity.Punishment;
import com.cng.punishment.exception.NotFoundException;
import com.cng.punishment.iu.model.PunishmentDto;

/**
 * PunishmentService
 */
public interface PunishmentService {

    public PunishmentDto getPunishment(Long id)  throws NotFoundException;
    public List<PunishmentDto> getPunishments();
    public PunishmentDto save(Punishment punishment);
    public PunishmentDto update(Punishment punishment,Long id)throws Exception;
    public void Delete(Long id);
    
}