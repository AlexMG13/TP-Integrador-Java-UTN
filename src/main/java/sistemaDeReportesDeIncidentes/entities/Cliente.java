package sistemaDeReportesDeIncidentes.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="clientes")
public class Cliente {
    @Column(name = "cliente_cuit")
    private @Getter @Setter String cliente_cuit;

    @Column(name= "razon_social")
    private @Getter @Setter String razonSocial;

    @Column(name = "cliente_nombre")
    private @Getter @Setter String nombre;

    @Column(name= "cliente_email")
    private @Getter @Setter String email;

    @ManyToMany
    @JoinTable(
            name = "cliente_servicio",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "servicio_id")
    )
    private @Getter @Setter List<Servicio> servicios_contratados;


    public Cliente(String cliente_cuit, String razonSocial, String nombre, String email, List<Servicio> servicios_contratados) {
        this.cliente_cuit = cliente_cuit;
        this.razonSocial = razonSocial;
        this.nombre = nombre;
        this.email = email;
        this.servicios_contratados = servicios_contratados;
    }

}
