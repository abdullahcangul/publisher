package com.cng.punishment.service;

import java.util.List;

import com.cng.punishment.entity.Human;
import com.cng.punishment.exception.NotFoundException;
import com.cng.punishment.iu.model.HumanDto;


/**
 * HumanService
 */

public interface HumanService  {

    public HumanDto getHuman(Long id)  throws NotFoundException;
    public List<HumanDto> getHumans();
    public HumanDto save(Human human);
    public HumanDto update(Human human,Long id)throws Exception;
    public void Delete(Long id);
    
}