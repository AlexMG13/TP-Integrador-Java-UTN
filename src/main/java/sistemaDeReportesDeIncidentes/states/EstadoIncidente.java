package sistemaDeReportesDeIncidentes.states;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import sistemaDeReportesDeIncidentes.context.Incidente;


public abstract class EstadoIncidente {

    public abstract void pasarARecibido(Incidente i);

    public abstract void pasarAAsignado(Incidente i);

    public abstract void pasarAResuelto(Incidente i);
}