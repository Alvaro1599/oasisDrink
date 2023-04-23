import java.time.LocalDateTime;

public class OrdenProducción {
    private String idOrden;
    private LocalDateTime fecha;
    private OrdenPPT[] lineaOrden;

    public OrdenProducción(String idOrden, LocalDateTime fecha, OrdenPPT[] lineaOrden) {
        this.idOrden = idOrden;
        this.fecha = fecha;
        this.lineaOrden = lineaOrden;
    }

    public String getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(String idOrden) {
        this.idOrden = idOrden;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public OrdenPPT[] getLineaOrden() {
        return lineaOrden;
    }

    public void setLineaOrden(OrdenPPT[] lineaOrden) {
        this.lineaOrden = lineaOrden;
    }

    public void agregarLineaOrden(OrdenPPT lineaOrden){
    }
}
