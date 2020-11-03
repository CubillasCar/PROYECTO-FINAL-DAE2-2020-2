package pe.isil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.model.Consulta;

@Repository
public interface ConsultaRepo extends JpaRepository<Consulta, Integer> {
}
