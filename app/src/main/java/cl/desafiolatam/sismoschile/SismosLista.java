package cl.desafiolatam.sismoschile;

public class SismosLista {

    private String Fecha;
    private String Latitud;
    private String Longitud;
    private String Profundidad;
    private String Magnitud;
    private String Agencia;
    private String RefGeografica;
    private String FechaUpdate;

    public SismosLista(String fecha, String latitud, String longitud, String profundidad, String magnitud, String agencia, String refGeografica, String fechaUpdate) {
        Fecha = fecha;
        Latitud = latitud;
        Longitud = longitud;
        Profundidad = profundidad;
        Magnitud = magnitud;
        Agencia = agencia;
        RefGeografica = refGeografica;
        FechaUpdate = fechaUpdate;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getLatitud() {
        return Latitud;
    }

    public void setLatitud(String latitud) {
        Latitud = latitud;
    }

    public String getLongitud() {
        return Longitud;
    }

    public void setLongitud(String longitud) {
        Longitud = longitud;
    }

    public String getProfundidad() {
        return Profundidad;
    }

    public void setProfundidad(String profundidad) {
        Profundidad = profundidad;
    }

    public String getMagnitud() {
        return Magnitud;
    }

    public void setMagnitud(String magnitud) {
        Magnitud = magnitud;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getRefGeografica() {
        return RefGeografica;
    }

    public void setRefGeografica(String refGeografica) {
        RefGeografica = refGeografica;
    }

    public String getFechaUpdate() {
        return FechaUpdate;
    }

    public void setFechaUpdate(String fechaUpdate) {
        FechaUpdate = fechaUpdate;
    }

    @Override
    public String toString() {
        return "SismosLista{" +
                "Fecha='" + Fecha + '\'' +
                ", Latitud='" + Latitud + '\'' +
                ", Longitud='" + Longitud + '\'' +
                ", Profundidad='" + Profundidad + '\'' +
                ", Magnitud='" + Magnitud + '\'' +
                ", Agencia='" + Agencia + '\'' +
                ", RefGeografica='" + RefGeografica + '\'' +
                ", FechaUpdate='" + FechaUpdate + '\'' +
                '}';
    }
}