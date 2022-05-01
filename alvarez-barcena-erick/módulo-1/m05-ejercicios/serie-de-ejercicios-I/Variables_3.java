import java.util.Scanner;

import static java.lang.Math.pow;

public class Variables_3 {

    //Leer dos a y b decimales desde el usuario y mostrar a ^ b.

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\t Escribe un numero decimal: ");
        float a = entrada.nextFloat(); entrada.nextLine();
        System.out.print("\n\t Escribe un numero decimal: ");
        float b = entrada.nextFloat(); entrada.nextLine();

        System.out.printf("\n\t %.3f ^ %.3f = %.3f",a,b,pow(a,b));


    }

}
