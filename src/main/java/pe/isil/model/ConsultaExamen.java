package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@IdClass(ConsultaExamenPK.class)
@Table(name = "tbl_consulta_examen")
public class ConsultaExamen {

    // [idConsulta(FK) idExamen(FK)] PK
    @Id
    private Consulta consulta;

    @Id
    private Examen examen;

}
