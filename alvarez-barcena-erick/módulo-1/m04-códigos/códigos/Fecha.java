import java.util.Calendar;

public class Fecha {

    private int año;
    private int mes;
    private int dia;

    public Fecha(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes-1;
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public boolean getDiaSemana{
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.año,this.mes-1,this.dia);
        int diaSemana=calendar.get(Calendar.DAY_OF_WEEK);
        return diaSemana;
    }

    public boolean isLunes(){
        return this.getDiaSemana()==calendar.MONDAY;
    }

    public boolean isFinDeSemana(){

    }

}
