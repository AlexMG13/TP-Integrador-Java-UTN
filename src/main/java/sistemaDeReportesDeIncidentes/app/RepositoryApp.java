/*package sistemaDeReportesDeIncidentes.app;

import sistemaDeReportesDeIncidentes.context.Incidente;
import sistemaDeReportesDeIncidentes.entities.Cliente;
import sistemaDeReportesDeIncidentes.services.IncidenteRepository;

import java.time.LocalDate;
import java.util.*;
public class RepositoryApp {
        public static final Integer incidente_id = Integer.valueOf(25);

        public static void main(String[] args) {
            // Creo la capa de servicio
            IncidenteRepository repo = new IncidenteRepository();
            try {

                // Antes de ejecutar este caso, cambiar en persistence.xml la propiedad
                // <property name="hibernate.hbm2ddl.auto" value="create" />
                casoUno(repo);
                // A partir de aquí. Cambiar la propiedad en persistence.xml
                // <property name="hibernate.hbm2ddl.auto" value="none" />

            } catch (Exception e) {
                // em.getTransaction().rollback();
                e.printStackTrace();
            }

        }

        private static void casoUno(IncidenteRepository repo) throws Exception {
            Incidente i5 = new Incidente();
            i5.setFecha_incidente(LocalDate.of(2023,05,11));
            i5.setDescripcion("Se mojó el dispositivo");

            repo.add(i5);

            System.out.println("Id del incidente creado es:" + i5.getIncidente_id());

        }

         //TODO

    }
}*/
