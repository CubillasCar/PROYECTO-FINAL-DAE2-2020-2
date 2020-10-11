package pe.isil.service;



import java.util.List;

public interface IPacienteService<C,K> {

    void create(C c);
    void update(C c);
    void delete(C c);

    C findById(K k);
    List<C> findAll();
}
