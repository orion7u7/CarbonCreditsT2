package edu.unillanos.carboncreditst2.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "evaluador")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Evaluador {

    @Id
    @Column(name = "id_evaluador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_evaluador")
    private String nombre;

    @Column(name = "email_evaluador")
    private String email;
}
