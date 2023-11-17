package sistemaDeReportesDeIncidentes;

import java.time.LocalDate;
import java.util.List;

public class Incidente {

    private int idIncidente;

    private String cuitCliente;

    private int idTecnico;

    private EstadoIncidente estado;

    private LocalDate fechaIncidente;

    private LocalDate fechaResolucion;

    private List<Problema> tipoProblema;

    private String descripcion;

    private Servicio tipoServicio;

    private int horasEstimadas;





    public List<Tecnico> devolverTecnico();

    public void notificarTecnico();

    public void notificarClienteResuelto();

    public int calcularHorasEstimadas();

}
