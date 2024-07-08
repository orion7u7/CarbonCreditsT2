package edu.unillanos.carboncreditst2.controllers;

import edu.unillanos.carboncreditst2.models.Evaluacion;
import edu.unillanos.carboncreditst2.services.EvaluacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/evaluaciones")
@RequiredArgsConstructor
public class EvaluacionController {

    private final EvaluacionService evaluacionService;

    @PostMapping
    public Evaluacion crearEvaluacion(@RequestParam Long areaId, @RequestBody String resultado) {
        return evaluacionService.crearEvaluacion(areaId, resultado);
    }
}