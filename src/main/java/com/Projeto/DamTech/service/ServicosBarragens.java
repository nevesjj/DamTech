package com.Projeto.DamTech.service;

import com.Projeto.DamTech.entity.Barragens;
import com.Projeto.DamTech.repository.RepoBarragem;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicosBarragens {

    @Autowired
    private RepoBarragem repoBarragem;

    @Transactional
    public Barragens criarBarragens(Barragens barragens) {return repoBarragem.save(barragens);}

    public Optional<Barragens> buscarBarragens(Long id) {return repoBarragem.findById(id);}

    public List<Barragens> buscarTodasBarragens() {return repoBarragem.findAll();}
}
