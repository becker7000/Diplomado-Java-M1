import java.util.Scanner;

public class CondicionalesTradicionales_1 {

    //Leer una variable entera y determinar si es par.

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\t Escribe un entero: ");
        int entero = entrada.nextInt(); entrada.nextLine();

        if(entero%2==0)
            System.out.print("\n\t El número es par.");
        else
            System.out.print("\n\t El número es impar.");

    }

}
