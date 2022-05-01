public class PagoTienda extends Pago{

    private String idTienda;

    public PagoTienda(Venta venta, String id, String tipo, String idTienda) {
        super(venta, id, tipo);
        this.idTienda = idTienda;
    }

    @Override
    public String mostrarPago(){
        return super.mostrarPago()+"ID Tienda: "+this.idTienda+"\n+-+-+-+-+-+-+-+\n";
    }

}
