public class CiclosCondicionales_2 {

    public static void main(String[] args) {

        final double tasa=0.02;
        final double montoInicial=4600;
        double montoFinal=montoInicial;
        double interes=0;
        interes=montoInicial*tasa;
        int meses=1;
        do {
            interes=montoFinal*0.02;
            montoFinal=montoFinal+interes;
            System.out.printf("\n\t %d) $%.2f",meses,interes);
            meses++;
        }while(interes<montoInicial);

        System.out.printf("\n\t %d meses deben transcurrir para que" +
                " el interes supere el monto inicial.",meses);
    }

}
