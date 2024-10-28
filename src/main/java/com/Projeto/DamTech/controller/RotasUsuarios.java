package com.Projeto.DamTech.controller;

import com.Projeto.DamTech.entity.Usuarios;
import com.Projeto.DamTech.service.ServicosUsuarios;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("v1/usuarios")
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
