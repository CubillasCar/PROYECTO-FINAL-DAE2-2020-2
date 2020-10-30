package pe.isil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.model.Paciente;
import pe.isil.repository.IPacienteRepo;

import java.util.List;

@Service
public class PacienteService implements IPacienteService<Paciente, Integer> {

    @Autowired
    IPacienteRepo iPacienteRepo;


    @Override
    public void create(Paciente paciente) {
        iPacienteRepo.save(paciente);

    }

    @Override
    public void update(Paciente paciente) {
        iPacienteRepo.save(paciente);
    }

    @Override
    public void deleteById(Integer id) {
        iPacienteRepo.deleteById(id);
    }

    @Override
    public Paciente findById(Integer id) {
        return iPacienteRepo.findById(id).orElse(null);
    }

    @Override
    public List<Paciente> findAll() {
        return iPacienteRepo.findAll();
    }
}
