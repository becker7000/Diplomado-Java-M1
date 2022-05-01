import java.util.Date;
import java.util.List;

public class Venta {

    private Date date;
    private Vendedor vendedor;
    private Cliente cliente;
    private String terminal;
    private String payment;
    private List<Producto> productos;

    public Venta(Date date, Vendedor vendedor, Cliente cliente, String terminal, String payment, List<Producto> productos) {
        this.date = date;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.terminal = terminal;
        this.payment = payment;
        this.productos = productos;
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public double calcularTotal(){
        double suma = 0.0;

        for (Producto producto : this.productos) {
            suma = suma + producto.getPrecio();
        }

        return suma;
    }

    public String mostrarVenta() {
        String text = "";

        text += this.terminal + "\n";
        text += this.date.toString() + "\n";
        text += "-------------------" + "\n";
        text += "Usuario:" + this.vendedor + "\n";
        text += "Cliente:" + this.cliente + "\n";
        text += "Terminal:" + this.terminal + "\n";
        text += "-------------------" + "\n";
        for (Producto producto : this.productos)
            text += producto + "\n";
        text += "-------------------" + "\n";
        text += this.payment + "\n";
        text += "Total:"+this.calcularTotal()+"\n";
        text += "-------------------" + "\n";

        return text;
    }
}