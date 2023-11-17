package sistemaDeReportesDeIncidentes;

import java.util.List;

public class AreaComercial {

    private List<Cliente> listaClientes;

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void altaCliente();
    public void bajaCliente();
    public void modificarCliente();
}
