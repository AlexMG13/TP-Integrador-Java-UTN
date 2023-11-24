package sistemaDeReportesDeIncidentes;

import jakarta.persistence.EntityManager;

public class DAOFactory {
    public static ReporteDAO getReporteDAO(EntityManager em){
        return new ReporteDAOImpl(em);
    }
}
