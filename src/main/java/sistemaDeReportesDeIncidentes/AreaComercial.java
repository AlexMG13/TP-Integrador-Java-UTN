package sistemaDeReportesDeIncidentes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="area_comercial")
public class AreaComercial {

    @Column
    private @Getter @Setter List<Cliente> listaClientes;


    public void altaCliente();
    public void bajaCliente();
    public void modificarCliente();
}
