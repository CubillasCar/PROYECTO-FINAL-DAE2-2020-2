package pe.isil.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Data
@Entity
@Table(name = "consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "num_consultorio", length = 3, nullable = true)
    private String numConsultorio;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    //------------------------------------------------------------------------------
    //LLAVES FORANEAS: PACIENTE - MEDICO - ESPECIALIDAD

    @Column(name = "pacienteId")
    private Integer pacienteId;

    @ManyToOne
    @JoinColumn(name = "pacienteId", insertable = false, updatable = false)
    private Paciente paciente;

//
//    @Column(name="medicoId")
//    private Integer medicoId;
//
//    @ManyToOne
//    @JoinColumn(name = "medicoId", insertable = false, updatable = false)
//    private Medico medico;
//
//    @Column(name="especialidadId")
//    private Integer especialidadId;
//
//    @ManyToOne
//    @JoinColumn(name = "especialidadId", insertable = false, updatable = false)
//    private Especialidad especialidad;


    //--------------------------------------------------------------------------

//    @OneToMany (mappedBy = "consulta", cascade = {CascadeType.ALL}, orphanRemoval = true)
//    private List<DetalleConsulta> detalleConsulta;




}
