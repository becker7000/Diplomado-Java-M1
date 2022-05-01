public class ProductoEnLinea extends Producto{

    private String almacen;

    public ProductoEnLinea(String codigo, String nombre, double precio, int existencias, String almacen) {
        super(codigo, nombre, precio, existencias);
        this.almacen = almacen;
    }

    @Override
    public String mostrarProducto(){
        return super.mostrarProducto()+"Almacen: "+this.almacen+"\n+-+-+-+-+-+-+-+\n";
    }
}
