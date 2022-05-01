import java.util.Date;
import java.util.List;

public class VentaEnLinea extends Venta{

    private String domicilio;

    public VentaEnLinea(Date date, Vendedor vendedor, Cliente cliente, String terminal, String payment, List<Producto> productos, String domicilio) {
        super(date, vendedor, cliente, terminal, payment, productos);
        domicilio = domicilio;
    }

    @Override
    public String mostrarVenta(){
        return super.mostrarVenta()+"Domicilio: "+this.domicilio+"\n+-+-+-+-+-+-+-+\n";
    }

}
