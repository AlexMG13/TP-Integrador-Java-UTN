package sistemaDeReportesDeIncidentes.services;

import jakarta.persistence.EntityManager;
import sistemaDeReportesDeIncidentes.Reporte;
import sistemaDeReportesDeIncidentes.daos.ReporteDAO;
import sistemaDeReportesDeIncidentes.factories.DAOFactory;

import java.util.*;

public class ReporteRepository {

    private ReporteDAO reporteDAO;

    public ReporteRepository(EntityManager em){
        this.reporteDAO = DAOFactory.getReporteDAO(em);
    }

    public void add(Reporte reporte){
        ///reporte.get+++++
    }
}
