package sistemaDeReportesDeIncidentes;

import java.util.List;

public class Tecnico {

    private int idTecnico;
    private String nombre;
    private List<Especialidad> especialidad;
    private int cantidadIncidentesResueltos;
    private MedioComunicacion medioPreferido;

    public Tecnico(int idTecnico, String nombre, List<Especialidad> especialidad, MedioComunicacion medioPreferido) {
        this.idTecnico = idTecnico;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.medioPreferido = medioPreferido;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Especialidad> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(List<Especialidad> especialidad) {
        this.especialidad = especialidad;
    }

    public int getCantidadIncidentesResueltos() {
        return cantidadIncidentesResueltos;
    }

    public void setCantidadIncidentesResueltos(int cantidadIncidentesResueltos) {
        this.cantidadIncidentesResueltos = cantidadIncidentesResueltos;
    }

    public MedioComunicacion getMedioPreferido() {
        return medioPreferido;
    }

    public void setMedioPreferido(MedioComunicacion medioPreferido) {
        this.medioPreferido = medioPreferido;
    }

    public boolean resolverIncidente();
    public String indicarConsideraciones();
}
