package com.cng.punishment.iu.controller;

import java.util.List;

import javax.validation.Valid;

import com.cng.punishment.entity.PunishmentType;
import com.cng.punishment.exception.NotFoundException;
import com.cng.punishment.service.PunishmentTypeService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PunishmentTypeController
 */
@RestController
@RequestMapping("api/PunishmentType")
public class PunishmentTypeController {

    private final PunishmentTypeService punishmentTypeService;

    public PunishmentTypeController( PunishmentTypeService punishmentTypeService) {
        this.punishmentTypeService=punishmentTypeService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<PunishmentType> getPunishment(@PathVariable("id")Long id) throws NotFoundException{
       return ResponseEntity.ok(punishmentTypeService.getPunishmentType(id));
    }

    @GetMapping("")
    public ResponseEntity<List<PunishmentType>> getPunishments() throws NotFoundException{
        return ResponseEntity.ok(punishmentTypeService.getPunishmentTypes());
    }

    @PostMapping(value="")
    public ResponseEntity<PunishmentType> savePunishmentType(@Valid @RequestBody PunishmentType punishmentType) {
        return ResponseEntity.ok(punishmentTypeService.save(punishmentType));
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<PunishmentType> updatePunishmentType(@PathVariable Long id,@Valid @RequestBody  PunishmentType punishmentType) {       
        return ResponseEntity.ok(punishmentTypeService.save(punishmentType));
    }

    @DeleteMapping("")
    public ResponseEntity<?> deletePunishmentType(@PathVariable Long id){
        punishmentTypeService.Delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
    
}