package pe.isil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.model.Consulta;
import pe.isil.repository.ConsultaRepo;

import java.util.List;

@Service
public class ConsultaService implements BasicService<Consulta, Integer> {

    @Autowired
    private ConsultaRepo consultaRepo;

    @Override
    public void createOrUpdate(Consulta consulta) {
        consultaRepo.save(consulta);
    }

    @Override
    public void deleteById(Integer id) {
        consultaRepo.deleteById(id);
    }

    @Override
    public List<Consulta> findAll() {
        return consultaRepo.findAll();
    }

    @Override
    public Consulta findById(Integer id) {
        return consultaRepo.findById(id).orElse(null);
    }
}
