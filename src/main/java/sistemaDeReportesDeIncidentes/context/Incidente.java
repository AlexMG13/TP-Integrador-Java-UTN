package sistemaDeReportesDeIncidentes.context;

import jakarta.persistence.*;
import lombok.*;
import sistemaDeReportesDeIncidentes.Cliente;
import sistemaDeReportesDeIncidentes.Problema;
import sistemaDeReportesDeIncidentes.Servicio;
import sistemaDeReportesDeIncidentes.Tecnico;
import sistemaDeReportesDeIncidentes.states.EstadoIncidente;



import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="incidentes")
public class Incidente {

    @Id
    @Column(name = "incidente_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter Integer idIncidente;

    @ManyToOne
    @JoinColumn(name = "cliente_cuit", referencedColumnName = "cuit")
    private @Getter @Setter Cliente cuitCliente;

    @Column
    private @Getter @Setter LocalDate fechaIncidente;

    @ManyToMany
    @JoinTable(
            name = "incidente_problema",
            joinColumns = @JoinColumn(name = "incidente_id"),
            inverseJoinColumns = @JoinColumn(name = "problema_id")
    )
    private @Getter @Setter  List<Problema> problemas;

    @Column
    private @Getter @Setter String descripcion;

    @ManyToOne
    @JoinColumn(name = "servicio_id", referencedColumnName = "id_servicio")
    private @Getter @Setter Servicio tipoServicio;

    @ManyToOne
    @JoinColumn
    private @Getter @Setter EstadoIncidente estado;

    //@OneToOne
    //@JoinColumn(name = "fk_tecnico_id")
    @ManyToOne
    @JoinColumn(name = "fk_tecnico_id")
    private @Getter @Setter Tecnico tecnico_asignado;

    @Column
    private @Getter @Setter int horasEstimadas;

    @Column
    private @Getter @Setter LocalDate fechaResolucion;


    public List<Tecnico> devolverTecnico();

    public void notificarTecnico();

    public void notificarClienteResuelto();

    public int calcularHorasEstimadas();

}
