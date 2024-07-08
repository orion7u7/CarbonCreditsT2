package edu.unillanos.carboncreditst2.repositories;

import edu.unillanos.carboncreditst2.models.AreaEvaluada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaEvaluadaRepository extends JpaRepository<AreaEvaluada, Long> {
}
