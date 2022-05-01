public class PagoEnLinea extends Pago{

    private String codPostal;

    public PagoEnLinea(Venta venta, String id, String tipo, String codPostal) {
        super(venta, id, tipo);
        this.codPostal = codPostal;
    }

    @Override
    public String mostrarPago(){
        return super.mostrarPago()+"C.Postal: "+this.codPostal+"\n+-+-+-+-+-+-+-+\n";
    }


}
