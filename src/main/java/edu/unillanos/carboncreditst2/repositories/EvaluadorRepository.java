package edu.unillanos.carboncreditst2.repositories;

import edu.unillanos.carboncreditst2.models.Evaluador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluadorRepository extends JpaRepository<Evaluador, Long> {
}
