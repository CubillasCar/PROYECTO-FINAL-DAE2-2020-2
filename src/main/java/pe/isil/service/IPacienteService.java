package pe.isil.service;

import pe.isil.model.Paciente;

import java.util.List;

public interface IPacienteService {

    Paciente registrar (Paciente pac);
    Paciente modificar (Paciente pac);
    List<Paciente> listar();
    Paciente listarPorId(Integer id);
    void eliminar(Integer id);
}
