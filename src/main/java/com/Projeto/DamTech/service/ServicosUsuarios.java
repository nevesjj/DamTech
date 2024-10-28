package com.Projeto.DamTech.service;

import com.Projeto.DamTech.entity.Usuarios;
import com.Projeto.DamTech.repository.RepoUsuario;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicosUsuarios {

    @Autowired
    private RepoUsuario repoUsuario;

    @Transactional
    public Usuarios criarUsuario(Usuarios usuario) {return repoUsuario.save(usuario);}

    public Optional<Usuarios> buscarUsuario (Long id) {return repoUsuario.findById(id);}
}
