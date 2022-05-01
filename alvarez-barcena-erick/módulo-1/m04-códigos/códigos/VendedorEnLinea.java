public class VendedorEnLinea extends Vendedor{

    private String correo;

    public VendedorEnLinea(String id, String nombre, String correo) {
        super(id, nombre);
        this.correo = correo;
    }

    @Override
    public String mostrarVendedor(){
        return super.mostrarVendedor()+"Correo: "+this.correo+"\n+-+-+-+-+-+-+-+-+\n";
    }
}
