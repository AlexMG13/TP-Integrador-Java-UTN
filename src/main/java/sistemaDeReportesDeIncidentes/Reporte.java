package sistemaDeReportesDeIncidentes;

public class Reporte {

    private int idReporte;
    private int idIncidente;
    private int idTecnico;

    public Reporte(int idReporte, int idIncidente, int idTecnico) {
        this.idReporte = idReporte;
        this.idIncidente = idIncidente;
        this.idTecnico = idTecnico;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public int getIdIncidente() {
        return idIncidente;
    }

    public void setIdIncidente(int idIncidente) {
        this.idIncidente = idIncidente;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public void modificarEstadoIncidente();
}
