package sistemaDeReportesDeIncidentes;

public class Problema {

    private int idProblema;

    private String tipoProblema;

    public Problema(int idProblema, String tipoProblema) {
        this.idProblema = idProblema;
        this.tipoProblema = tipoProblema;
    }

    public int getIdProblema() {
        return idProblema;
    }

    public void setIdProblema(int idProblema) {
        this.idProblema = idProblema;
    }

    public String getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(String tipoProblema) {
        this.tipoProblema = tipoProblema;
    }
}
