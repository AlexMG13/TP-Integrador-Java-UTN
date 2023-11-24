package sistemaDeReportesDeIncidentes.daos;

import jakarta.persistence.EntityManager;
import sistemaDeReportesDeIncidentes.Reporte;
import sistemaDeReportesDeIncidentes.daos.ReporteDAO;

public class ReporteDAOImpl implements ReporteDAO {
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
