package pe.isil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.model.Especialidad;
import pe.isil.repository.EspecialidadRepo;

import java.util.List;

@Service
public class EspecialidadService implements BasicService<Especialidad, Integer> {

    @Autowired
    private EspecialidadRepo especialidadRepo;

    @Override
    public void createOrUpdate(Especialidad especialidad) {
        especialidadRepo.save(especialidad);
    }

    @Override
    public void deleteById(Integer id) {
        especialidadRepo.deleteById(id);
    }

    @Override
    public List<Especialidad> findAll() {
        return especialidadRepo.findAll();
    }

    @Override
    public Especialidad findById(Integer id) {
        return especialidadRepo.findById(id).orElse(null);
    }
}
