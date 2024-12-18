package com.Projeto.DamTech.controller;

import com.Projeto.DamTech.entity.Barragens;
import com.Projeto.DamTech.service.ServicosBarragens;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("v1/barragens")
@CrossOrigin(origins = "*")
public class RotasBarragens {

    private final ServicosBarragens servicosBarragens;

    @PostMapping
    public ResponseEntity<Barragens> criarBarragem(@RequestBody Barragens barragens) {
        Barragens salvarBarragens = servicosBarragens.criarBarragens(barragens);
        return ResponseEntity.status(201).body(salvarBarragens);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Barragens> obterBarragem(@PathVariable Long id) {
        Optional<Barragens> barragens = servicosBarragens.buscarBarragens(id);
        return ResponseEntity.status(200).body(barragens.get());
    }

    @GetMapping("/todas")
    public ResponseEntity<List<Barragens>> obterTodasBarragem() {
        List<Barragens> barragens = servicosBarragens.buscarTodasBarragens();
        return ResponseEntity.status(200).body(barragens);
    }
}
