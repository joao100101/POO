package com.joaovictormundel.api.controller;


import com.joaovictormundel.api.model.CandidatoEntity;
import com.joaovictormundel.api.model.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("candidatos")
public class CandidatoController {

    @Autowired
    private CandidatoRepository repo;

    @GetMapping
    public List<CandidatoEntity> getAll(){
        return repo.findAll();
    }

    @PostMapping
    public ResponseEntity<CandidatoEntity> create(@RequestBody CandidatoEntity c){
        return ResponseEntity.ok(repo.save(c));
    }




}
