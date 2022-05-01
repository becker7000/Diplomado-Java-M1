public class VendedorTienda extends Vendedor{

    private String terminal;

    public VendedorTienda(String id, String nombre, String terminal) {
        super(id, nombre);
        this.terminal = terminal;
    }

    @Override
    public String mostrarVendedor(){
        return super.mostrarVendedor()+"Terminal: "+this.terminal+"\n+-+-+-+-+-+-+-+-+\n";
    }

}
