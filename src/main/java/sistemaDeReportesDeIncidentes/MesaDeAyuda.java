package sistemaDeReportesDeIncidentes;

import java.util.List;

public class MesaDeAyuda {

    private List<Cliente> listaClientes;
    private List<Tecnico> listaTecnicos;
    private List<Incidente> listaIncidentes;


    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Tecnico> getListaTecnicos() {
        return listaTecnicos;
    }

    public void setListaTecnicos(List<Tecnico> listaTecnicos) {
        this.listaTecnicos = listaTecnicos;
    }

    public List<Incidente> getListaIncidentes() {
        return listaIncidentes;
    }

    public void setListaIncidentes(List<Incidente> listaIncidentes) {
        this.listaIncidentes = listaIncidentes;
    }

    public void registrarIncidente();
    public void asignarTecnico();
    public void informarCliente();
    public void agregarHoras();

}
