package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.io.Serializable;


@Data
@Embeddable
public class ConsultaExamenPK implements Serializable {

    @ManyToMany
    @JoinColumn(name = "id_consulta", nullable = false)
    private Consulta consulta;

    @ManyToMany
    @JoinColumn(name = "id_examen", nullable = false)
    private Examen examen;


}
