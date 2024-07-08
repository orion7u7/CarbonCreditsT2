package edu.unillanos.carboncreditst2.services;

import edu.unillanos.carboncreditst2.models.AreaEvaluada;
import edu.unillanos.carboncreditst2.models.EstadoArea;
import edu.unillanos.carboncreditst2.models.Evaluacion;
import edu.unillanos.carboncreditst2.repositories.AreaEvaluadaRepository;
import edu.unillanos.carboncreditst2.repositories.EvaluacionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class EvaluacionService {

    private final EvaluacionRepository evaluacionRepository;
    private final AreaEvaluadaRepository areaEvaluadaRepository;

    public Evaluacion crearEvaluacion(Long areaId, String resultado) {
        AreaEvaluada area = areaEvaluadaRepository.findById(areaId).orElse(null);
        if (area != null) {
            Evaluacion evaluacion = new Evaluacion();
            evaluacion.setAreaEvaluada(area);
            evaluacion.setFechaEvaluacion(LocalDate.now());
            evaluacion.setResultados(resultado);
            
            area.setEstado(EstadoArea.EVALUADA);
            areaEvaluadaRepository.save(area);
            
            return evaluacionRepository.save(evaluacion);
        }
        return null;
    }
}