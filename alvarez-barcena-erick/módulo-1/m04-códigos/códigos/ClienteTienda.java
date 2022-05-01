public class ClienteTienda extends Cliente{

    private String telefono;
    private String terminal;

    public ClienteTienda(String id, String nombre, String telefono, String telefono1, String terminal) {
        super(id, nombre, telefono);
        this.telefono = telefono1;
        this.terminal = terminal;
    }

    @Override
    public String mostrarCliente(){
        return super.mostrarCliente()+"Telefono: "+this.telefono+"Terminal: "+this.terminal+"\n"+"+-+-+-+-+-+-+-+-+-+-+-\n\n";
    }

}
