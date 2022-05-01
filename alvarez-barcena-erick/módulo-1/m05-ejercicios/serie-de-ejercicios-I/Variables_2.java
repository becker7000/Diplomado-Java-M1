import java.util.Scanner;

public class Variables_2 {

    //Leer dos variables decimales desde el usuario y mostrar su suma.

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\t Escribe un numero decimal: ");
        float x = entrada.nextFloat(); entrada.nextLine();
        System.out.print("\n\t Escribe otro un numero decimal: ");
        float y = entrada.nextFloat(); entrada.nextLine();

        System.out.printf("\n\t %.3f + %.3f = %.3f",x,y,(x+y));

    }

}
