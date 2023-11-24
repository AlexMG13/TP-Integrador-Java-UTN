package sistemaDeReportesDeIncidentes;

import jakarta.persistence.EntityManager;

import java.util.*;

public class ReporteDAOImpl implements ReporteDAO{
    private EntityManager em;

    public ReporteDAOImpl(EntityManager em){
        this.em = em;
    }

    @Override
    public void create(Reporte reporte) {
        em.persist(reporte);
    }

    @Override
    public Reporte read(Integer id) {
        return em.find(entityClass: Reporte.class, id);
    }

    @Override
    public void update(Reporte reporte) {
        em.merge(reporte);
    }

    @Override
    public void delete(Reporte reporte) {
        em.refresh(reporte);
        em.remove(reporte);
    }
}
