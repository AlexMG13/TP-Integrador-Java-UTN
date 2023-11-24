package sistemaDeReportesDeIncidentes.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="especialidades")
public class Especialidad {

    @Id
    @Column(name = "especialidad_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter
    @Setter Integer especialidad_id;

    @Column(name = "especialidad_nombre")
    private @Getter @Setter String nombre;

    @ManyToMany(mappedBy = "especialidades")
    private @Getter @Setter List<Tecnico> tecnicos;


    public Especialidad(String nombre) {

        this.nombre = nombre;
    }
}