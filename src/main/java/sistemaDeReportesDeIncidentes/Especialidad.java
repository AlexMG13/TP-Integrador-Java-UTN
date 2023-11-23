package sistemaDeReportesDeIncidentes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="especialidad")
public class Especialidad {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter
    @Setter int idEspecialidad;

    @Column
    private @Getter
    @Setter String nombre;

    public Especialidad(int idEspecialidad, String nombre) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
    }
}