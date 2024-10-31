package com.Projeto.DamTech.controller;

import com.Projeto.DamTech.entity.Visitas;
import com.Projeto.DamTech.service.ServicosVisitas;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("v1/visitas")
@CrossOrigin(origins = "*")
public class RotasVisitas {

    private final ServicosVisitas servicosVisitas;

    @PostMapping
    public ResponseEntity<Visitas> criarVisita(@RequestBody Visitas visita) {
        Visitas salvarVisitas = servicosVisitas.criarVisita(visita);
        return ResponseEntity.status(201).body(salvarVisitas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Visitas> obterVisita(@PathVariable Long id) {
        Optional<Visitas> visitas = servicosVisitas.buscarVisita(id);
        return ResponseEntity.status(200).body(visitas.get());
    }
}
