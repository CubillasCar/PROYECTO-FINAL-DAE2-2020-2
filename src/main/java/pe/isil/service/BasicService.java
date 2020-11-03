package pe.isil.service;
import java.util.List;

public interface BasicService<C,K> {

    void createOrUpdate(C c);
    void deleteById(K k);

    List<C> findAll();
    C findById(K k);
}
