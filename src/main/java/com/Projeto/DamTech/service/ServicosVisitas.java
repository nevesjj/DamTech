package com.Projeto.DamTech.service;

import com.Projeto.DamTech.entity.Visitas;
import com.Projeto.DamTech.repository.RepoVisita;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicosVisitas {

    @Autowired
    private RepoVisita repoVisita;

    @Transactional
    public Visitas criarVisita(Visitas visita) {return repoVisita.save(visita);}

    public Optional<Visitas> buscarVisita(Long id) {return repoVisita.findById(id);}

    public List<Visitas> buscarTodasVisita() {return repoVisita.findAll();}
}
