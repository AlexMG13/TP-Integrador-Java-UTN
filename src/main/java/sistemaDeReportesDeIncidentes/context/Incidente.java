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
    private @Getter @Setter int idTecnico;

    @Column
    private @Getter @Setter EstadoIncidente estado;

    @Column
    private @Getter @Setter LocalDate fechaIncidente;

    @Column
    private @Getter @Setter LocalDate fechaResolucion;

    @Column
    private @Getter @Setter  List<Problema> tipoProblema;

    @Column
    private @Getter @Setter String descripcion;

    @Column
    private @Getter @Setter Servicio tipoServicio;

    @Column
    private @Getter @Setter int horasEstimadas;



    public List<Tecnico> devolverTecnico();

    public void notificarTecnico();

    public void notificarClienteResuelto();

    public int calcularHorasEstimadas();

}
