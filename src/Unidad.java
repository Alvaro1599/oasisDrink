public class Unidad {
    private String idUnidad;
    private String descripción;

    public Unidad(String idUnidad, String descripción) {
        this.idUnidad = idUnidad;
        this.descripción = descripción;
    }

    public String getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
}
