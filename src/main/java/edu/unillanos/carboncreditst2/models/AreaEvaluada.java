package edu.unillanos.carboncreditst2.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "area_evaluada")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AreaEvaluada {

    @Id
    @Column(name = "id_area_evaluada")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_area_evaluada")
    private String nombre;

    @Column(name = "ubicacion_area_evaluada")
    private String ubicacion;

    @Column(name = "areaTotal_area_evaluada")
    private Double areaTotal;

    @Column(name = "areaBosque_area_evaluada")
    private Double areaBosque;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_area_evaluada")
    private EstadoArea estado;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Propietario propietario;

    @ManyToOne
    @JoinColumn(name = "id_evaluador")
    private Evaluador evaluador;
}
