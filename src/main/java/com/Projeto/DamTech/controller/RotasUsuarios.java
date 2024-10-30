package com.Projeto.DamTech.controller;

import com.Projeto.DamTech.entity.Usuarios;
import com.Projeto.DamTech.service.ServicosUsuarios;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("v1/usuarios")
@CrossOrigin(origins = "http://localhost:4200/")
public class RotasUsuarios {

    private final ServicosUsuarios servicosUsuarios;

    @PostMapping
    public ResponseEntity<Usuarios> criarUsuario(@RequestBody Usuarios usuario) {
        Usuarios salvarUsuario = servicosUsuarios.criarUsuario(usuario);
        return ResponseEntity.status(201).body(salvarUsuario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuarios> obterUsuario(@PathVariable Long id) {
        Optional<Usuarios> usuarios = servicosUsuarios.buscarUsuario(id);
        return ResponseEntity.status(200).body(usuarios.get());
    }

}
