import java.util.ArrayList;
import java.util.Scanner;

public class IteradoresDeLista_1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> enteros = new ArrayList<>();
        System.out.print("\n\t Cuantos numeros leer? ");
        int tam = entrada.nextInt(); entrada.nextLine();

        int x, suma=0;
        //x será una variable auxiliar
        //Se agregan elementos a la lista según tam.
        for (int i = 0; i < tam; i++) {
            System.out.printf("\n\t Escribe el valor %d: ",(i+1));
            x= entrada.nextInt(); entrada.nextLine();
            suma+=x;
            enteros.add(x);
        }

        System.out.printf("\n\t La suma total de los elementos es: %d",suma);
        entrada.close();

    }
}
