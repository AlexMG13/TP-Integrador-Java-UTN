package sistemaDeReportesDeIncidentes;

public class Cliente {
    private String cuit;
    private String razonSocial;
    private String nombre;
    private String email;
    private int telefono;
    private Servicio servicioContratado;

    public Cliente(String cuit, String razonSocial, String nombre, String email, int telefono, Servicio servicioContratado) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.servicioContratado = servicioContratado;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Servicio getServicioContratado() {
        return servicioContratado;
    }

    public void setServicioContratado(Servicio servicioContratado) {
        this.servicioContratado = servicioContratado;
    }

    public void reportarIncidente();
}
