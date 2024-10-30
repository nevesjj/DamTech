package com.Projeto.DamTech.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "barragens")
public class Barragens implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_barragens")
    private Long id_barragens;
    @Column(name = "cidade", nullable = false, unique = false, length = 30)
    private String cidade;
    @Column(name = "estado", nullable = false, unique = false, length = 30)
    private String estado;
    @Column(name = "nome_barragens", nullable = false, unique = true, length = 50)
    private String nome_barragens;

}
