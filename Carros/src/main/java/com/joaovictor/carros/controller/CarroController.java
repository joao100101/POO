package com.joaovictor.carros.controller;

import com.joaovictor.carros.model.Carro;
import com.joaovictor.carros.model.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("carros")
public class CarroController {

    @Autowired
    private CarroRepository repo;

    @PostMapping
    public void create(@RequestBody Carro car){
        repo.save(car);
    }

    @GetMapping
    public List<Carro> readAll(){
        return repo.findAll();
    }

    @GetMapping(value = "{id}")
    public Carro readOne(@PathVariable Long id){
        return repo.findById(id).orElse(null);
    }

    @PutMapping(value = "{id}")
    public void update(@PathVariable Long id, @RequestBody Carro car){
        Carro antigo = repo.findById(id).orElse(null);

        antigo.setAno(car.getAno());
        antigo.setMarca(car.getMarca());
        antigo.setModelo(car.getModelo());
        antigo.setPotencia(car.getPotencia());

        repo.save(antigo);
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable Long id){
        repo.deleteById(id);
    }

}
