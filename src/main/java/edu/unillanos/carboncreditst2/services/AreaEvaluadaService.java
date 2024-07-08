package edu.unillanos.carboncreditst2.services;

import edu.unillanos.carboncreditst2.models.AreaEvaluada;
import edu.unillanos.carboncreditst2.models.EstadoArea;
import edu.unillanos.carboncreditst2.models.Evaluador;
import edu.unillanos.carboncreditst2.repositories.AreaEvaluadaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AreaEvaluadaService {

    private final AreaEvaluadaRepository areaEvaluadaRepository;

    public List<AreaEvaluada> getAllAreas() {
        return areaEvaluadaRepository.findAll();
    }

    public AreaEvaluada getAreaById(Long id) {
        return areaEvaluadaRepository.findById(id).orElse(null);
    }

    public AreaEvaluada createArea(AreaEvaluada area) {
        area.setEstado(EstadoArea.CREADA);
        return areaEvaluadaRepository.save(area);
    }

    public AreaEvaluada asignarEvaluador(Long areaId, Long evaluadorId) {
        AreaEvaluada area = areaEvaluadaRepository.findById(areaId).orElse(null);
        if (area != null) {
            Evaluador evaluador = new Evaluador();
            evaluador.setId(evaluadorId);
            area.setEvaluador(evaluador);
            area.setEstado(EstadoArea.ASIGNADA);
            return areaEvaluadaRepository.save(area);
        }
        return null;
    }
}