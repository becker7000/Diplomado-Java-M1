import java.util.Scanner;

public class CondicionalesTradicionales_2 {

    //Leer una variable entera y determinar si es múltiplo de 5 o de 7.

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\t Escribe un entero: ");
        int entero = entrada.nextInt(); entrada.nextLine();

        if(entero%5==0 || entero%7==0)
            System.out.print("\n\t El número es múltiplo de 5 o 7");
        else
            System.out.print("\n\t El número no es múltiplo de 5 o 7");

    }

}
