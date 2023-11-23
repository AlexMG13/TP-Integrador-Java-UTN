package sistemaDeReportesDeIncidentes.context;

import jakarta.persistence.*;
import lombok.*;
import sistemaDeReportesDeIncidentes.Problema;
import sistemaDeReportesDeIncidentes.Servicio;
import sistemaDeReportesDeIncidentes.Tecnico;
import sistemaDeReportesDeIncidentes.states.EstadoIncidente;



import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="incidente")
public class Incidente {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter int idIncidente;

    @Column
    private @Getter @Setter String cuitCliente;

    @Column
    private @Getter @Setter LocalDate fechaIncidente;

    @ManyToMany
    @JoinTable(
            name = "problema_incidente",
            joinColumns = @JoinColumn(name = "id_incidente"),
            inverseJoinColumns = @JoinColumn(name = "problema_id")
    )
    private @Getter @Setter  List<Problema> tipoProblema;

    @Column
    private @Getter @Setter String descripcion;

    @ManyToOne
    @JoinColumn(name = "servicio_id", referencedColumnName = "id_servicio")
    private @Getter @Setter Servicio tipoServicio;

    @ManyToOne
    @JoinColumn
    private @Getter @Setter EstadoIncidente estado;

    @ManyToOne
    @JoinColumn(name = "tecnico_id", referencedColumnName = "id_tecnico")
    private @Getter @Setter Tecnico idTecnico;

    @Column
    private @Getter @Setter int horasEstimadas;

    @Column
    private @Getter @Setter LocalDate fechaResolucion;


    public List<Tecnico> devolverTecnico();

    public void notificarTecnico();

    public void notificarClienteResuelto();

    public int calcularHorasEstimadas();

}
