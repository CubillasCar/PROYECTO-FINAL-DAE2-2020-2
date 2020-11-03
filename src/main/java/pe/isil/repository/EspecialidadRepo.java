package pe.isil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.model.Especialidad;

@Repository
public interface EspecialidadRepo extends JpaRepository<Especialidad, Integer> {
}
