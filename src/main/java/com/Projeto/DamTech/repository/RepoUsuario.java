package com.Projeto.DamTech.repository;

import com.Projeto.DamTech.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoUsuario extends JpaRepository<Usuarios, Long> {
}
