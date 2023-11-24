package sistemaDeReportesDeIncidentes.daos;


import sistemaDeReportesDeIncidentes.Reporte;

public interface ReporteDAO {

    public void create(Reporte reporte);

    public Reporte read(Integer id);

    public void update (Reporte reporte);

    public void delete(Reporte reporte);

    //metodofindBy.....

}
