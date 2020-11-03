package pe.isil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.model.Medico;

@Repository
public interface MedicoRepo extends JpaRepository<Medico, Integer> {
}
