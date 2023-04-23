public class Receta {
    private String idProducto;
    private Integer cantidad;

    private RecetaDetalle[] detalles;

    public Receta(String idProducto, Integer cantidad, RecetaDetalle[] detalles) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.detalles = detalles;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public RecetaDetalle[] getDetalles() {
        return detalles;
    }

    public void setDetalles(RecetaDetalle[] detalles) {
        this.detalles = detalles;
    }

    public void agregarDetalle(RecetaDetalle detalle) {

    }

    public Double calcularCosto() {
        return 0.0;
    }
}
