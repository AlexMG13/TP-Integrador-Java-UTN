package sistemaDeReportesDeIncidentes;

import jakarta.persistence.*;
import lombok.*;
import sistemaDeReportesDeIncidentes.context.Incidente;

import java.util.*;

@Entity
@Table(name="tecnico")
public class Tecnico {

    @Id
    @Column(name = "tecnico_id")
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
    //@OneToOne(mappedBy = "tecnico_asignado")
    @OneToMany(mappedBy = "tecnico_asignado")
    private @Getter @Setter List<Incidente> incidentes;



    public boolean resolverIncidente();
    public String indicarConsideraciones();
}
