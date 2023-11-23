package sistemaDeReportesDeIncidentes;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name="tecnico")
public class Tecnico {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter int idTecnico;

    @Column
    private @Getter @Setter String nombre;
    @Column
    private @Getter @Setter List<Especialidad> especialidad;
    @Column
    private @Getter @Setter int cantidadIncidentesResueltos;
    @Column
    private @Getter @Setter MedioComunicacion medioPreferido;

    public Tecnico(int idTecnico, String nombre, List<Especialidad> especialidad, MedioComunicacion medioPreferido) {
        this.idTecnico = idTecnico;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.medioPreferido = medioPreferido;
    }

    public boolean resolverIncidente();
    public String indicarConsideraciones();
}
