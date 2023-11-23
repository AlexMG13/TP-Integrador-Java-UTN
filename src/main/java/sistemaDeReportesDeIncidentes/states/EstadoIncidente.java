package sistemaDeReportesDeIncidentes.states;

import sistemaDeReportesDeIncidentes.context.Incidente;

public interface EstadoIncidente {

    public void pasarARecibido(Incidente i);

    public void pasarAAsignado(Incidente i);

    public void pasarAResuelto(Incidente i);
}