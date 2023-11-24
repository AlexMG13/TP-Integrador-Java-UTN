/*

ESTO LO PODEMOS SACAR, ES IR MUY FINO

package sistemaDeReportesDeIncidentes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="reporte")
public class Reporte {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter int idReporte;

    @Column
    private @Getter @Setter int idIncidente;

    @Column
    private @Getter @Setter int idTecnico;

    public Reporte(int idReporte, int idIncidente, int idTecnico) {
        this.idReporte = idReporte;
        this.idIncidente = idIncidente;
        this.idTecnico = idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public void modificarEstadoIncidente();
}
*/