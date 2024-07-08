package edu.unillanos.carboncreditst2.repositories;

import edu.unillanos.carboncreditst2.models.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Long> {
}