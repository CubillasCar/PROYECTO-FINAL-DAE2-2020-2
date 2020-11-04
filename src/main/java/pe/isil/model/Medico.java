package pe.isil.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="tbl_medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombres", nullable = false, length = 70)
    private String nombres;

    @Column(name = "apellidos", nullable = false, length = 70)
    private String apellidos;

    @Column(name = "CMP", nullable = false, length = 12)
    private String CMP;

    @Column(name = "fotourl", nullable = true)
    private String fotoUrl;

//    @OneToMany(mappedBy = "medico")
//    private List<Consulta> consultas;

}
