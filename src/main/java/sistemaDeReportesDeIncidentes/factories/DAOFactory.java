package sistemaDeReportesDeIncidentes.factories;

import jakarta.persistence.EntityManager;
import sistemaDeReportesDeIncidentes.daos.ReporteDAO;
import sistemaDeReportesDeIncidentes.daos.ReporteDAOImpl;

public class DAOFactory {
    public static ReporteDAO getReporteDAO(EntityManager em){
        return new ReporteDAOImpl(em);
    }
}
