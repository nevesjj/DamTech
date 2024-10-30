package com.Projeto.DamTech.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "visitas")
public class Visitas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_visita")
    private Long id_visita;
    @Column(name = "id_barragem", nullable = false, length = 10)
    private Long id_barragem;
    @Column(name = "nivel_agua", nullable = false, length = 20)
    private String nivel_agua;
    @Column(name = "estrutura", nullable = false, length = 20)
    private String estrutura;
    @Column(name = "previsao_climatica", nullable = false, length = 20)
    private String previsao_climatica;
    @Column(name = "data_visita", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate data_visita;
    @Column(name = "status", nullable = false, length = 20)
    private String status;
}
