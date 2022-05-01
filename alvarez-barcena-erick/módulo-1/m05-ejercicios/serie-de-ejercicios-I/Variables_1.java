import java.util.Scanner;

public class Variables_1 {

    //Lee una variable entera desde el usuario y muestra
    // el mensaje: "Tu variable es: %d y el doble es %d"

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\t Escribe un valor entero: ");
        int entero = entrada.nextInt(); entrada.nextLine();
        System.out.printf("\n\t Tu variable es: %d y el doble es: %d",entero,entero*2);
    }

}
