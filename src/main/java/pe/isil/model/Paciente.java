package pe.isil.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Collection;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tbl_paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPaciente;

    //@Size para Strings


    @Size(min=3, message="Nombres debe tener minimo 3 caracteres")
    @Column(name = "nombres", nullable = false, length = 70)
    private String nombres;

    @Size(min=3, message="Apellidos debe tener minimo 3 caracteres")
    @Column(name = "apellidos", nullable = false, length = 70)
    private String apellidos;

    @Size(min=8, max=8, message="DNI debe tener 8 caracteres")
    @Column(name = "dni", nullable = false, length = 8)
    private String dni;

    @Size(min=3, max=150, message="Direccion debe tener minimo 3 caracteres")
    @Column(name = "direccion", nullable = false, length = 70)
    private String direccion;

    @Size(min=9, max=9, message="Telefono debe tener 9 caracteres")
    @Column(name = "telefono", nullable = false, length = 9)
    private String telefono;

    @Email
    @Column(name = "email", nullable = false, length = 70)
    private String email;



    @OneToMany(mappedBy = "paciente")
    private Collection<Consulta> consulta;


}
