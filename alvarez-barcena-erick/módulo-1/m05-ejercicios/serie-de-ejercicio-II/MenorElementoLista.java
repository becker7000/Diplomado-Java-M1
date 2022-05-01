import java.util.ArrayList;
import java.util.Scanner;
// 1. Crea una lista de decimales ArrayList<Double>
//      i) Lee los valores desde el usuario, tanto el número de elementos,
//          como los valores.
// 2. Busca el menor elemento de la lista e imprime el valor y su índice

public class MenorElementoLista {

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

        //Buscando el menor elemento:
        Double menor=decimales.get(0);
        int index = 0;
        for (int i = 0; i < cantidad; i++) {
            if (menor>decimales.get(i)){
                menor= decimales.get(i);
                index=i;
                break;
            }
        }

        System.out.printf("\n\t El elemento menor es: %.2f con indice %d",menor,index);
        entrada.close();
    }

}
