package sistemaDeReportesDeIncidentes.entities;

import jakarta.persistence.*;
import lombok.*;
import sistemaDeReportesDeIncidentes.MedioComunicacion;
import sistemaDeReportesDeIncidentes.context.Incidente;

import java.util.*;

@Entity
@Table(name="tecnicos")
public class Tecnico {

    @Id
    @Column(name = "tecnico_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter int tecnico_id;

    @Column(name = "tecnico_nombre")
    private @Getter @Setter String nombre;

    @ManyToMany
    @JoinTable(
            name = "tecnico_especialidad",
            joinColumns = @JoinColumn(name = "tecnico_id"),
            inverseJoinColumns = @JoinColumn(name = "especialidad_id")
    )
    private @Getter @Setter List<Especialidad> especialidades;

    @Column(name ="cantidad_incidentes_resueltos")
    private @Getter @Setter Integer cantidadIncidentesResueltos;

    ////SE PUEDE HACER RELACION ENTRE ENTIDADES CON UN ENUM???
    /*@Column (name= "medio_comunicacion")
    private @Getter @Setter MedioComunicacion medioPreferido;*/

    @OneToMany(mappedBy = "tecnico_asignado")
    private @Getter @Setter List<Incidente> incidentes;

    public Tecnico(String nombre, List<Especialidad> especialidades) {
        this.nombre = nombre;
        this.especialidades = especialidades;
        /////this.medioPreferido = medioPreferido;
    }

    public String indicarConsideraciones(){
        //TODO
    }

    public void modificarEstadoIncidente(){
        //TODO
    }
}
