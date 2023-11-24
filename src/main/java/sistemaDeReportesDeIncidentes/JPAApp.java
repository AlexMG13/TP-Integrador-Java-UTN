package sistemaDeReportesDeIncidentes;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sistemaDeReportesDeIncidentes.context.Incidente;

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



            Tecnico t1 = new Tecnico();
            t1.setNombre("Ana");
            t1.setMedioPreferido(MedioComunicacion.WHATSAPP);

            Problema p1 = new Problema("tipo 1");
            Problema p2 = new Problema("tipo 2");


            Incidente i1 = new Incidente();
            i1.setCuitCliente("23-35625665-8");
            i1.setFechaIncidente(LocalDate.of(2023,12,11));
            i1.setDescripcion("La computadora está muy lenta");
            i1.setProblemas(List.of(p1));
            i1.setTecnico_asignado(t1);

            Incidente i2 = new Incidente();
            i2.setCuitCliente("23-35625646-8");
            i2.setFechaIncidente(LocalDate.of(2023,12,10));
            i2.setDescripcion("La computadora no prende");
            i2.setProblemas(List.of(p1, p2));
            i2.setTecnico_asignado(t1);

            t1.setIncidentes(List.of(i1, i2));//lo haria un metodo que asigna el incidente al tecnico
            p1.setIncidentes(List.of(i1, i2));
            p2.setIncidentes(List.of(i2));




            em.persist(i1);
            em.persist(t1);
            em.persist(i2);
            em.persist(p1);
            em.persist(p2);


            em.getTransaction().commit();


        } catch(Exception e){
            e.printStackTrace();
        } finally{
            em.close();
        }
    }
}
