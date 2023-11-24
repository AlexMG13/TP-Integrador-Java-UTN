package sistemaDeReportesDeIncidentes.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sistemaDeReportesDeIncidentes.context.Incidente;
import sistemaDeReportesDeIncidentes.entities.*;

import java.time.LocalDate;
import java.util.*;

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

            Problema p1 = new Problema("tipo 1");
            Problema p2 = new Problema("tipo 2");

            Especialidad e1 = new Especialidad("tipo 1", List.of(p1));
            Especialidad e2 = new Especialidad("tipo 2", List.of(p1));
            Especialidad e3 = new Especialidad("tipo 3", List.of(p2));

            Tecnico t1 = new Tecnico("Ana", List.of(e1, e2));

            Servicio s1 = new Servicio("servicio 1", List.of(e1, e2));
            Servicio s2 = new Servicio("servicio 2", List.of(e2, e3));




            Cliente c1 = new Cliente("23-35625665-8", "Loma SA", "Pedro Pérez", "p.pérez@gmail.com", List.of(s1));
            Cliente c2 = new Cliente("23-35625646-8", "Condite SA", "Alicia Antrin", "alicia@gmail.com", List.of(s2));

            Incidente i1 = new Incidente();
            i1.setCliente_cuit(c1);
            i1.setFecha_incidente(LocalDate.of(2023,12,11));
            i1.setTipo_servicio(s1);
            i1.setDescripcion("La computadora está muy lenta");
            i1.setProblemas(List.of(p1));
            i1.setTecnico_asignado(t1);

            Incidente i2 = new Incidente();
            i2.setCliente_cuit(c2);
            i2.setFecha_incidente(LocalDate.of(2023,12,10));
            i2.setTipo_servicio(s2);
            i2.setDescripcion("La aplicación no inicia nunca");
            i2.setProblemas(List.of(p1, p2));
            i2.setTecnico_asignado(t1);

            t1.setIncidentes(List.of(i1, i2));//lo haria un metodo que asigna el incidente al tecnico
            p1.setIncidentes(List.of(i1, i2));
            p2.setIncidentes(List.of(i2));
            s1.setIncidentes(List.of(i1));
            s2.setIncidentes(List.of(i2));





            em.persist(i1);
            em.persist(t1);
            em.persist(i2);
            em.persist(p1);
            em.persist(p2);
            em.persist(s1);
            em.persist(s2);
            em.persist(c1);
            em.persist(c2);
            em.persist(e1);
            em.persist(e2);
            em.persist(e3);



            em.getTransaction().commit();


        } catch(Exception e){
            e.printStackTrace();
        } finally{
            em.close();
        }
    }
}
