public class OrdenPPT {
    private Receta receta;
    private Integer cantidad;

    public OrdenPPT(Receta receta, Integer cantidad) {
        this.receta = receta;
        this.cantidad = cantidad;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
