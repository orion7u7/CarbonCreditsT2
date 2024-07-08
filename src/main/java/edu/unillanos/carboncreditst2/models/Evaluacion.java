package edu.unillanos.carboncreditst2.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "evaluacion")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Evaluacion {

    @Id
    @Column(name = "id_evaluacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_area_evaluada")
    private AreaEvaluada areaEvaluada;

    @Column(name = "fecha_evaluacion")
    private LocalDate fechaEvaluacion;

    @Column(columnDefinition = "json")
    private String resultados;
}
