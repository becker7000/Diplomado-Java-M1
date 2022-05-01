public class ProductoTienda extends Producto{

    private String pasillo;

    public ProductoTienda(String codigo, String nombre, double precio, int existencias, String pasillo) {
        super(codigo, nombre, precio, existencias);
        this.pasillo = pasillo;
    }

    @Override
    public String mostrarProducto(){
        return super.mostrarProducto()+"Pasillo: "+this.pasillo+"\n+-+-+-+-+-+-+-+\n";
    }

}

