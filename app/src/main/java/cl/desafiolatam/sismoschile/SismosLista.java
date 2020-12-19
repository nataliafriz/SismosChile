package cl.desafiolatam.sismoschile;

public class SismosLista {
    private String fecha;
    private String latitud;
    private String longitud;
    private String profundidad;
    private String magnitud;
    private String agencia;
    private String refGeografica;
    private String fechaUpdate;

    public SismosLista(String fecha, String latitud, String longitud, String profundidad, String magnitud, String agencia, String refGeografica, String fechaUpdate) {
        this.fecha = fecha;
        this.latitud = latitud;
        this.longitud = longitud;
        this.profundidad = profundidad;
        this.magnitud = magnitud;
        this.agencia = agencia;
        this.refGeografica = refGeografica;
        this.fechaUpdate = fechaUpdate;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(String profundidad) {
        this.profundidad = profundidad;
    }

    public String getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(String magnitud) {
        this.magnitud = magnitud;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getRefGeografica() {
        return refGeografica;
    }

    public void setRefGeografica(String refGeografica) {
        this.refGeografica = refGeografica;
    }

    public String getFechaUpdate() {
        return fechaUpdate;
    }

    public void setFechaUpdate(String fechaUpdate) {
        this.fechaUpdate = fechaUpdate;
    }

    @Override
    public String toString() {
        return "SismosLista{" +
                "fecha='" + fecha + '\'' +
                ", latitud='" + latitud + '\'' +
                ", longitud='" + longitud + '\'' +
                ", profundidad='" + profundidad + '\'' +
                ", magnitud='" + magnitud + '\'' +
                ", agencia='" + agencia + '\'' +
                ", refGeografica='" + refGeografica + '\'' +
                ", fechaUpdate='" + fechaUpdate + '\'' +
                '}';
    }
}
