package pe.isil.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.model.Paciente;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPacienteRepo extends JpaRepository<Paciente, Integer> {

    Optional<List <Paciente>> findByNombres(String nombre);
    Optional<List <Paciente>> findByApellidos(String apellidos);
}
