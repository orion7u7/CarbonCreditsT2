package edu.unillanos.carboncreditst2.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "propietario")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Propietario {

    @Id
    @Column(name = "id_propietario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_propietario")
    private String nombre;

    @Column(name = "email_propietario")
    private String email;

}
