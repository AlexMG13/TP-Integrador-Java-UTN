package sistemaDeReportesDeIncidentes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="problema")
public class Problema {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter int idProblema;

    @Column
    private @Getter @Setter String tipoProblema;

    public Problema(int idProblema, String tipoProblema) {
        this.idProblema = idProblema;
        this.tipoProblema = tipoProblema;
    }


    public void setTipoProblema(String tipoProblema) {
        this.tipoProblema = tipoProblema;
    }
}
