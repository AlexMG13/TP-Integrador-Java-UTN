package sistemaDeReportesDeIncidentes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="problema")
public class Problema {

    @Id
    @Column(name = "id_problema")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter int idProblema;

    @Column(name = "tipo_problema")
    private @Getter @Setter String tipoProblema;

    public Problema(int idProblema, String tipoProblema) {
        this.idProblema = idProblema;
        this.tipoProblema = tipoProblema;
    }

    Problema p1 = new Problema(1,"tipo 1");
    Problema p2 = new Problema(2,"tipo 2");
    Problema p3 = new Problema(3,"tipo 3");
    Problema p4 = new Problema(4, "tipo 4");

}
