package com.Projeto.DamTech.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;
    @NotBlank
    @Column(name = "username", nullable = false, unique = true, length = 30)
    @Size(max = 25)
    private String username;
    @NotBlank
    @Column(name = "senha", nullable = false, length = 30)
    @Size(min = 8, max = 30)
    private String senha;

}
