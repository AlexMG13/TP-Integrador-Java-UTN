package sistemaDeReportesDeIncidentes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import sistemaDeReportesDeIncidentes.context.Incidente;

import java.util.*;

@Entity
@Table(name="problemas")
public class Problema {

    @Id
    @Column(name = "problema_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter Integer idProblema;

    @Column(name = "problema_tipo")
    private @Getter @Setter String tipoProblema;

    @ManyToMany(mappedBy = "problemas")
    public @Getter @Setter List<Incidente> incidentes;

    public Problema(String tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

    @Override
    public String toString() {
        return "Problema{" +
                "idProblema=" + idProblema +
                ", tipoProblema='" + tipoProblema + '\'' +
                '}';
    }



}
