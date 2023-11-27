/*package sistemaDeReportesDeIncidentes.states;

import sistemaDeReportesDeIncidentes.context.Incidente;


public class Recibido extends EstadoIncidente {

    public String estadoRecibido = "Recibido";

    @Override
    public void pasarARecibido(Incidente i) {
        i.setEstado_en_tabla(new Recibido().estadoRecibido);
    }

    @Override
    public void pasarAAsignado(Incidente i) {
        i.setEstado(new Asignado());
    }

    @Override
    public void pasarAResuelto(Incidente i) {
        i.setEstado(new Resuelto());
    }
}
*/