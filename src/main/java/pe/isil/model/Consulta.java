package pe.isil.model;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tbl_consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConsulta;

    @ManyToOne
    @JoinColumn(name="id_paciente", nullable=false, foreignKey= @ForeignKey(name="FK_consulta_paciente	"))//Fk_Consulta_Paciente
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name="id_medico", nullable=false, foreignKey=@ForeignKey(name="FK_consulta_medico"))
    private Medico medico;

    @ManyToOne
    @JoinColumn(name="id_especialidad", nullable=false, foreignKey=@ForeignKey(name="fk_consulta_especialidad"))
    private Especialidad especialidad;


    //--------------------------------------------------------------------------
    @Column(name = "num_consultorio", length = 3, nullable = true)
    private String numConsultorio;

    @Column(name="fecha", nullable=false)
    private LocalDateTime fecha;


    //----------------------------------------------------------------------------
    //Detalle Consulta
    //OneToMany a nivel logico
    //lo que le pase a la tabla padre tambien le afecta a la tabla detalle.
    //orphan sirve para eliminar algun elemento del detalle
    @OneToMany(mappedBy="consulta",cascade= {CascadeType.ALL}, orphanRemoval=true)
    private List<DetalleConsulta> detalleConsulta;

    //Generar hashCode y equals de idConsulta
    //se hace esto para que sean usadas en la tabla ConsultaexamenPK
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idConsulta == null) ? 0 : idConsulta.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Consulta other = (Consulta) obj;
        if (idConsulta == null) {
            if (other.idConsulta != null)
                return false;
        } else if (!idConsulta.equals(other.idConsulta))
            return false;
        return true;
    }

}
