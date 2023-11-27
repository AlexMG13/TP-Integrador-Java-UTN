/*package sistemaDeReportesDeIncidentes.daos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import sistemaDeReportesDeIncidentes.context.Incidente;

import java.util.List;

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
        return em.find(Incidente.class, id);
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

    public List<Incidente> findByTecnicoId(Integer id_tecnico){
        TypedQuery<Incidente> q = em.createQuery("SELECT t FROM Incidente t WHERE t.fk_tecnico.id = :id_tecnico",
                Incidente.class);
        q.setParameter("tecnico_id", id_tecnico);
        return q.getResultList();
    }

}*/
