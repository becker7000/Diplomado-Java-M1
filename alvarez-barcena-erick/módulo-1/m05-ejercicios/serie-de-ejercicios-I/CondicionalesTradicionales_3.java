import java.util.Scanner;

public class CondicionalesTradicionales_3 {

    /*
    * Leer una variable decimal y determinar si sus decimales son mayores a 0.5 o menores.
    * Por ejemplo 3.8 es mayor pero 3.49 menor (no se considera el entero).
    * */

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\t Escribe un valor decimal: ");
        float decimal = entrada.nextFloat(); entrada.nextLine();

        int parteEntera=(int)decimal;
        float parteDecimal=decimal-parteEntera;

        if(parteDecimal>0.5)
            System.out.print("\n\t Los decimales del numero son mayores a 0.5");
        else if(parteDecimal<0.5)
            System.out.print("\n\t Los decimales del numero son menores a 0.5");
        else
            System.out.print("\n\t La parte decimal del numero es 0.5");

        entrada.close();
    }

}
