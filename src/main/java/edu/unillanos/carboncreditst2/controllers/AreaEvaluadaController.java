package edu.unillanos.carboncreditst2.controllers;

import edu.unillanos.carboncreditst2.models.AreaEvaluada;
import edu.unillanos.carboncreditst2.services.AreaEvaluadaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/areas")
@RequiredArgsConstructor
public class AreaEvaluadaController {

    private final AreaEvaluadaService areaEvaluadaService;

    @GetMapping
    public List<AreaEvaluada> getAllAreas() {
        return areaEvaluadaService.getAllAreas();
    }

    @GetMapping("/{id}")
    public AreaEvaluada getAreaById(@PathVariable Long id) {
        return areaEvaluadaService.getAreaById(id);
    }

    @PostMapping
    public AreaEvaluada createArea(@RequestBody AreaEvaluada area) {
        return areaEvaluadaService.createArea(area);
    }

    @PutMapping("/{id}/asignar")
    public AreaEvaluada asignarEvaluador(@PathVariable Long id, @RequestParam Long evaluadorId) {
        return areaEvaluadaService.asignarEvaluador(id, evaluadorId);
    }
}