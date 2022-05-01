public class ClienteEnLinea extends Cliente{

    private String correo;

    public ClienteEnLinea(String id, String nombre, String telefono, String correo) {
        super(id, nombre, telefono);
        this.correo = correo;
    }

    @Override
    public String mostrarCliente(){
        return super.mostrarCliente()+"Correo: "+this.correo+"\n"+"+-+-+-+-+-+-+-+-+-+-+-\n\n";
    }
}
