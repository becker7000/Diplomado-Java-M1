public class Cliente {

    private String id;
    private String nombre;

    public Cliente(String id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }


    public String mostrarCliente(){
        String info="";
        info += "------Cliente------\n";
        info += "-------------------\n";
        info += "Nombre: "+this.nombre+"\n";
        info += "-+-+-+-+-+-+-+-+-+-+\n";

        return info;
    }

}
