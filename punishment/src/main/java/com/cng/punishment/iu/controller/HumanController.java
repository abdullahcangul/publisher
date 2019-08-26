package com.cng.punishment.iu.controller;

import java.util.List;

import javax.validation.Valid;

import com.cng.punishment.entity.Human;
import com.cng.punishment.exception.NotFoundException;
import com.cng.punishment.iu.model.HumanDto;
import com.cng.punishment.service.HumanService;

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
 * HumanController
 */
@RestController
@RequestMapping("api/human")
public class HumanController {

    private final HumanService humanService;

    public HumanController(HumanService humanService) {
        this.humanService=humanService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<HumanDto> getHuman(@PathVariable("id")Long id) throws NotFoundException{
       return ResponseEntity.ok(humanService.getHuman(id));
    }

    @GetMapping("")
    public ResponseEntity<List<HumanDto>> getHumans() throws NotFoundException{
        return ResponseEntity.ok(humanService.getHumans());
    }

    @PostMapping(value="")
    public ResponseEntity<HumanDto> saveHuman(@Valid @RequestBody Human human) {
        return ResponseEntity.ok(humanService.save(human));
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<HumanDto> updateHuman(@PathVariable Long id,@Valid @RequestBody Human human) {       
        return ResponseEntity.ok(humanService.save(human));
    }

    @DeleteMapping("")
    public ResponseEntity<?> deleteHuman(@PathVariable Long id){
        humanService.Delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
    
}