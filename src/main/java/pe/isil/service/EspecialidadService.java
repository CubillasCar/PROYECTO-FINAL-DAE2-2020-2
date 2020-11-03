package pe.isil.service;

import org.springframework.stereotype.Service;
import pe.isil.model.Especialidad;

import java.util.List;

@Service
public class EspecialidadService implements BasicService<Especialidad, Integer> {
    @Override
    public void createOrUpdate(Especialidad especialidad) {

    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public List<Especialidad> findAll() {
        return null;
    }

    @Override
    public Especialidad findById(Integer integer) {
        return null;
    }
}
