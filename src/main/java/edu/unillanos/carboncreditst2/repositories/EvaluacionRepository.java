package edu.unillanos.carboncreditst2.repositories;

import edu.unillanos.carboncreditst2.models.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long> {
}
