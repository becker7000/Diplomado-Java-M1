import java.util.Date;
import java.util.List;

public class VentaTienda extends Venta{

    private String idTienda;

    public VentaTienda(Date date, Vendedor vendedor, Cliente cliente, String terminal, String payment, List<Producto> productos, String idTienda) {
        super(date, vendedor, cliente, terminal, payment, productos);
        this.idTienda = idTienda;
    }

    @Override
    public String mostrarVenta(){
        return super.mostrarVenta()+"ID Tienda: "+this.idTienda+"\n+-+-+-+-+-+-+-+\n";
    }

}
