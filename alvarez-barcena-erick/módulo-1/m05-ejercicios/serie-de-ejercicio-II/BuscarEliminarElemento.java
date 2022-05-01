
//     Buscar y eliminar un elemento de una lista
//     Crea una lista de decimales ArrayList<Double>
//     Lee los valores desde el usuario, tanto el número de elementos, como los valores.
//     Solicita al usuario un elemento de la lista
//     Determina si el elemento existe
//     Imprime el índice del elemento si es que existe dentro de la lista
//     Elimina el elemento de la lista en ese índice

import java.util.ArrayList;
import java.util.Scanner;

public class BuscarEliminarElemento {

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

        //Pidiendo al usuario un elemento:
        Double elemento;
        System.out.print("\n\tDime un elemento de la lista: ");
        elemento=entrada.nextDouble(); entrada.nextLine();

        for (int i = 0; i < cantidad; i++) {
            if(elemento.equals(decimales.get(i))){
                System.out.print("\n\t El elemento "+elemento+" existe.");
                System.out.print("\n\t Su indice es: "+i);
                decimales.remove(i);
                System.out.print("\n\t Elemento eliminado.");
                break;
            }
        }

    }

}
