package sistemaDeReportesDeIncidentes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import sistemaDeReportesDeIncidentes.context.Incidente;

import java.util.List;

@Entity
@Table(name="mesa_de_ayuda")
public class MesaDeAyuda {

    @Column
    private @Getter @Setter List<Cliente> listaClientes;

    @Column
    private @Getter @Setter List<Tecnico> listaTecnicos;

    @Column
    private @Getter @Setter List<Incidente> listaIncidentes;


    public void registrarIncidente();
    public void asignarTecnico();
    public void informarCliente();
    public void agregarHoras();

}*/
