package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;


@Data
@Entity
@Table(name = "tbl_consulta_examen")
public class ConsultaExamen {


 private ConsultaExamenPK id;
    @Id
    private Consulta idConsulta;

    @Id
    private Examen examen;


  }
