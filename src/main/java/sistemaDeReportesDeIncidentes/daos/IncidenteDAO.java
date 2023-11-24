package sistemaDeReportesDeIncidentes.daos;


import sistemaDeReportesDeIncidentes.context.Incidente;

public interface IncidenteDAO {

    public void create(Incidente incidente);

    public Incidente read(Integer id);

    public void update (Incidente incidente);

    public void delete(Incidente incidente);

    //TODO

}
