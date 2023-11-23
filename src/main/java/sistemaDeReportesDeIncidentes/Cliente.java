package sistemaDeReportesDeIncidentes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="cliente")
public class Cliente {
    @Column
    private @Getter @Setter String cuit;

    @Column
    private @Getter @Setter String razonSocial;

    @Column
    private @Getter @Setter String nombre;

    @Column
    private @Getter @Setter String email;

    @Column
    private @Getter @Setter int telefono;

    @Column
    private @Getter @Setter Servicio servicioContratado;

    public Cliente(String cuit, String razonSocial, String nombre, String email, int telefono, Servicio servicioContratado) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.servicioContratado = servicioContratado;
    }

    public void setServicioContratado(Servicio servicioContratado) {
        this.servicioContratado = servicioContratado;
    }

    public void reportarIncidente();
}
