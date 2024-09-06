package com.timal.rutas.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timal.rutas.models.Ruta;
import com.timal.rutas.services.RutasService;

@RequestMapping("/rutas")
@RestController
public class RutasController {
    @Autowired
    RutasService rutasService;

    @GetMapping
    public ResponseEntity<List<Ruta>> listar(){
        List<Ruta> choferes = this.rutasService.getAll();
        if(choferes.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.ok(choferes);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable(name="id") Long id){
        Optional<Ruta> c = rutasService.findById(id);
        if(c.isPresent()){
            return ResponseEntity.ok(c.get());
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }   

    @PostMapping
    public ResponseEntity<?> post(@RequestBody Ruta c){
        Ruta save = rutasService.save(c);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }
}
