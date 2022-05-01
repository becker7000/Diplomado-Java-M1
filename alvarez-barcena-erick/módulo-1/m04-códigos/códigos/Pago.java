public class Pago {

    private Venta venta;
    private String id;
    private String tipo; //Limitado a efectivo o tarjeta.

    public Pago(Venta venta, String id, String tipo) {
        this.venta = venta;
        this.id = id;
        this.tipo = tipo;
    }

    public String mostrarPago(){
        String info="";
        info += "------Pago------\n";
        info += "-------------------\n";
        info += "Tipo: "+this.tipo+"\n";
        info += "ID: "+this.id+"\n";
        info += "Total: "+venta.calcularTotal()+"\n";
        info += "-+-+-+-+-+-+-+-+-+-+\n";
        return info;
    }
}
