package sistemaDeReportesDeIncidentes.daos;

import jakarta.persistence.EntityManager;
import sistemaDeReportesDeIncidentes.Reporte;
import sistemaDeReportesDeIncidentes.context.Incidente;

public class IncidenteDAOImpl implements IncidenteDAO {
    private EntityManager em;

    public IncidenteDAOImpl(EntityManager em){
        this.em = em;
    }

    @Override
    public void create(Incidente incidente) {
        em.persist(incidente);
    }

    @Override
    public Incidente read(Integer id) {
        return em.find(entityClass: Incidente.class, id);
    }

    @Override
    public void update(Incidente incidente) {
        em.merge(incidente);
    }

    @Override
    public void delete(Incidente incidente) {
        em.refresh(incidente);
        em.remove(incidente);
    }

    //TODO
}
