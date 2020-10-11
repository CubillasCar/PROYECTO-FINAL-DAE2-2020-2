package pe.isil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.model.Paciente;

@Repository
public interface IPacienteRepo extends JpaRepository<Paciente, Integer> {
}
