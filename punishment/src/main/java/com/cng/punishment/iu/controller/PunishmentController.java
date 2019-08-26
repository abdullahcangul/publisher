package com.cng.punishment.iu.controller;

import java.util.List;

import javax.validation.Valid;

import com.cng.punishment.entity.Punishment;
import com.cng.punishment.exception.NotFoundException;
import com.cng.punishment.iu.model.PunishmentDto;
import com.cng.punishment.service.PunishmentService;

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
 * PunishmentController
 */
@RestController
@RequestMapping("api/Punishment")
public class PunishmentController {

    private final PunishmentService punishmentService;

    public PunishmentController(PunishmentService punishmentService) {
        this.punishmentService=punishmentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<PunishmentDto> getPunishment(@PathVariable("id")Long id) throws NotFoundException{
       return ResponseEntity.ok(punishmentService.getPunishment(id));
    }

    @GetMapping("")
    public ResponseEntity<List<PunishmentDto>> getPunishments() throws NotFoundException{
        return ResponseEntity.ok(punishmentService.getPunishments());
    }

    @PostMapping(value="")
    public ResponseEntity<PunishmentDto> saveHuman(@Valid @RequestBody Punishment punishment) {
        return ResponseEntity.ok(punishmentService.save(punishment));
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<PunishmentDto> updateHuman(@PathVariable Long id,@Valid @RequestBody  Punishment punishment) {       
        return ResponseEntity.ok(punishmentService.save(punishment));
    }

    @DeleteMapping("")
    public ResponseEntity<?> deleteHuman(@PathVariable Long id){
        punishmentService.Delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}