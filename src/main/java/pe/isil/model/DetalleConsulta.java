package pe.isil.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_detalle_onsulta")
public class DetalleConsulta {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer IdDetalle;

    @ManyToOne
    @JoinColumn(name="id_consulta", nullable=false, foreignKey=@ForeignKey(name="FK_consulta_detalle"))
    private Consulta consulta;

    @Column(name="diagnostico", nullable=false)
    private String diagnostico;

    @Column(name="tratamiento", nullable=false)
    private String tratamiento;

    public Integer getIdDetalle() {
        return IdDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        IdDetalle = idDetalle;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
}

