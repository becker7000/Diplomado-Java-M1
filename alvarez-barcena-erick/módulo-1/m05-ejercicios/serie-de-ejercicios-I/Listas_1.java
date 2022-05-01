import java.util.ArrayList;
import java.util.Scanner;

public class Listas_1 {

    //    Crear un ArrayList<Integer>
    //    Agregar algunos elementos (al menos 3)
    //    Sumar los elementos de la lista
    //    Preguntarle al usuario cuántos elementos más meter a la lista
    //    Leer cada elemento nuevo y agregarlo a la lista
    //    Volver a sumar los elementos de la lista
    //    Reportar la diferencia entre ambos

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Crendo ArrayList de tipo Integer
        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.add(5);
        enteros.add(7);
        enteros.add(11);
        enteros.add(17);

        int suma=0;
        //Sumando los valores de la lista enteros.
        for(int x:enteros)
            suma+=x;
        System.out.print("\n\t La suma es: "+suma);

        //Pidiendo cuantos valores extra se desean agregar.
        System.out.print("\n\t Cuantos elementos más deseas agregar? ");
        int extras = entrada.nextInt(); entrada.nextLine();
        int x,nuevaSuma=0;
        //Agregando la cantidad de elemento elejida y sumandolos.
        for (int i = 0; i < extras; i++) {
            System.out.print("\n\t Escribe un valor: ");
            x= entrada.nextInt(); entrada.nextLine();
            enteros.add(x);
            System.out.print("\n\t Numero agregado a la lista!");
            nuevaSuma+=x;
        }

        //Reportando la suma total de valores y la diferencia
        //entre la nueva suma y la anterior:
        System.out.print("\n\n\t La suma total es: "+(suma+nuevaSuma));
        System.out.print("\n\t La diferencia entre la nueva suma y la anterios es de: "+nuevaSuma);
        System.out.println();
        entrada.close();
    }

}