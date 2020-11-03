package pe.isil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.model.Medico;
import pe.isil.repository.MedicoRepo;

import java.util.List;

@Service
public class MedicoService implements BasicService<Medico, Integer> {

    @Autowired
    private MedicoRepo medicoRepo;

    @Override
    public void createOrUpdate(Medico medico) {
        medicoRepo.save(medico);
    }

    @Override
    public void deleteById(Integer id) {
        medicoRepo.deleteById(id);
    }

    @Override
    public List<Medico> findAll() {
        return medicoRepo.findAll();
    }

    @Override
    public Medico findById(Integer id) {
        return medicoRepo.findById(id).orElse(null);
    }
}
