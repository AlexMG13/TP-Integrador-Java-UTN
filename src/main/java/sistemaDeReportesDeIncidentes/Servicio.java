package sistemaDeReportesDeIncidentes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="servicio")
public class Servicio {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter int idServicio;

    @Column
    private @Getter @Setter String nombre;

    @Column
    private @Getter @Setter List<Especialidad> especialidad;

    public Servicio(String nombre, List<Especialidad> especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
}