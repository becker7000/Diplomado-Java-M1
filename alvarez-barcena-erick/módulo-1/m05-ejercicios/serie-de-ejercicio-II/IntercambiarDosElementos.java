// 1. Intercambiar dos elementos de una lista
//    i) Crea una lista de decimales ArrayList<Double>
// 2. Lee los valores desde el usuario, tanto el número de elementos, como los valores.
//    Solicita al usuario los índices de dos elementos
//       i) Intercambia los valores de la lista en esos índices
//      ii) Imprime la lista intercambiada

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IntercambiarDosElementos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> decimales = new ArrayList<>();

        //Pidiendo la cantidad de numeros:
        System.out.print("\n\tDame la cantidad de numeros: ");
        int cantidad = entrada.nextInt(); entrada.nextLine();

        //Guardando cada valor de la lista:
        for (int i = 0; i < cantidad; i++) {
            Double x;
            System.out.printf("\n\t Valor del numero %d: ",(i+1));
            x=entrada.nextDouble();
            decimales.add(x);
        }

        //Pidiendo dos indices:
        int index_1,index_2;
        System.out.print("\n\t Dame un indice: ");
        index_1= entrada.nextInt(); entrada.nextLine();
        System.out.print("\t Dame otro indice: ");
        index_2= entrada.nextInt(); entrada.nextLine();

        //Intercambiando los valores:
        Collections.swap(decimales,index_1,index_2);

        //Imprimiendo lista modificada:
        System.out.println();
        for (Double x: decimales) {
            System.out.print("\t "+x);
        }

    }

}
