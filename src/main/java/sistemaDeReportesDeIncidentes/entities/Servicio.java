package sistemaDeReportesDeIncidentes.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import sistemaDeReportesDeIncidentes.context.Incidente;

import java.util.List;

@Entity
@Table(name="servicios")
public class Servicio {
    @Id
    @Column(name = "servicio_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter Integer servicio_id;

    @Column(name = "servicio_nombre")
    private @Getter @Setter String nombre;

    @OneToMany
    @JoinColumn(name = "servicio_id", referencedColumnName = "servicio_id")
    private @Getter @Setter List<Especialidad> especialidades;

    @OneToMany(mappedBy = "tipo_servicio")
    private @Getter @Setter List<Incidente> incidentes;

    @ManyToMany(mappedBy = "servicios_contratados")
    private @Getter @Setter List<Cliente> clientes;

    public Servicio(String nombre, List<Especialidad> especialidades) {
        this.nombre = nombre;
        this.especialidades = especialidades;
    }
}