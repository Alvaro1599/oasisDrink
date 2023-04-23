public class Producto extends SKUItem{
    private Double precioVenta;
    private Double diasCaducidad;

    public Producto(String codigoItem, String nombre, Double precioCosto, Double precioVenta, Double diasCaducidad) {
        super(codigoItem, nombre, precioCosto);
        this.precioVenta = precioVenta;
        this.diasCaducidad = diasCaducidad;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getDiasCaducidad() {
        return diasCaducidad;
    }

    public void setDiasCaducidad(Double diasCaducidad) {
        this.diasCaducidad = diasCaducidad;
    }
}
