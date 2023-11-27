package sistemaDeReportesDeIncidentes.context;

import jakarta.persistence.*;
import lombok.*;
import sistemaDeReportesDeIncidentes.entities.Cliente;
import sistemaDeReportesDeIncidentes.entities.Problema;
import sistemaDeReportesDeIncidentes.entities.Servicio;
import sistemaDeReportesDeIncidentes.entities.Tecnico;
import sistemaDeReportesDeIncidentes.states.EstadoIncidente;



import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="incidentes")
public class Incidente {

    @Id
    @Column(name = "incidente_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter Integer incidente_id;

    @ManyToOne
    @JoinColumn(name = "fk_cliente_cuit", referencedColumnName = "cliente_cuit")
    private @Getter @Setter Cliente cliente_cuit;

    @Column(name = "fecha_incidente")
    private @Getter @Setter LocalDate fecha_incidente;

    @ManyToMany
    @JoinTable(
            name = "incidente_problema",
            joinColumns = @JoinColumn(name = "incidente_id"),
            inverseJoinColumns = @JoinColumn(name = "problema_id")
    )
    private @Getter @Setter  List<Problema> problemas;

    @Column(name = "incidente_descripcion")
    private @Getter @Setter String descripcion;

    @ManyToOne
    @JoinColumn(name = "fk_servicio_id", referencedColumnName = "servicio_id")
    private @Getter @Setter Servicio tipo_servicio;

    private @Getter @Setter String estado_en_tabla;

    //private @Getter @Setter EstadoIncidente estado;

    @ManyToOne
    @JoinColumn(name = "fk_tecnico_id", referencedColumnName = "tecnico_id")
    private @Getter @Setter Tecnico tecnico_asignado;

    @Column(name = "incidente_horas_estimadas")
    private @Getter @Setter Integer horasEstimadas;

    @Column(name = "fecha_resolucion")
    private @Getter @Setter LocalDate fechaResolucion;


    /*public void pasarARecibido(){
        this.estado.pasarARecibido(this);
    }

    public void pasarAAsignado(){
        this.estado.pasarAAsignado(this);
    }

    public void pasarAResuelto() {
        this.estado.pasarAResuelto(this);
        }
    */
}
