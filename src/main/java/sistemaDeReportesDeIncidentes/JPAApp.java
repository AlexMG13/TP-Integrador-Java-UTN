package sistemaDeReportesDeIncidentes;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sistemaDeReportesDeIncidentes.context.Incidente;

import java.time.LocalDate;

public class JPAApp {

    public static EntityManager getEntityManager(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tpIntegradorPU");
        EntityManager em = emf.createEntityManager();
        return em;
    }

    public static void main (String[] args){
        EntityManager em = getEntityManager();
        try{
            em.getTransaction().begin();
            ///do persistence stuff

            Incidente i1 = new Incidente();
            i1.setCuitCliente("23-35625665-8");
            i1.setFechaIncidente(LocalDate.of(2023,12,11));
            i1.setDescripcion("La computadora está muy lenta");
            em.getTransaction().commit();


        } catch(Exception e){
            e.printStackTrace();
        } finally{
            em.close();
        }
    }
}
