public class Vendedor {

    private String id;
    private String nombre;

    public Vendedor(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String mostrarVendedor(){
        String info="";
        info += "------Vendedor------\n";
        info += "-------------------\n";
        info += "Nombre: "+this.nombre+"\n";
        info += "-+-+-+-+-+-+-+-+-+-+\n";

        return info;
    }

}
