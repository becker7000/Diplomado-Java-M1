import java.util.ArrayList;
import java.util.Scanner;

public class OrdenarLista {

//    1. Crea una lista de decimales ArrayList<Double>
//        i) Lee los valores desde el usuario, tanto el número de elementos, como los valores.
//    2. Ordena la lista con el algoritmo descrito.
//
//    ALGORITMO:
//    1. Crear una lista vacía `ArrayList<Double>` llamada la lista final
//    2. Mientras la lista original tenga elementos
//      2.1 Buscar el elemento menor de la lista original (índice y valor)
//      2.2 Agregar el elemento menor en la lista final
//      2.3 Eliminar el elemento menor de la lista original
//    3. Imprimir la lista final que es la lista ya ordenada

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

        //Creando lista vacía:
        ArrayList<Double> listaFinal = new ArrayList<>();

        //Mientras la lista tenga elementos:

        while (!decimales.isEmpty()){

            //Buscando el menor elemento:
            Double menor=decimales.get(0);
            int index=0;
            for (int i = 0; i < decimales.size(); i++) {
                if (menor>decimales.get(i)){
                    menor= decimales.get(i);
                    index=i;
                    break;
                }
            }

            //Agregando elemento menor a la lista final.
            listaFinal.add(menor);

            //Eliminando elemento menor:
            decimales.remove(decimales.get(index));

        }

        //Imprimiendo la lista ordenada:
        System.out.print("\n\t Lista ordenada: ");
        for (Double x : listaFinal) {
            System.out.print("\t "+x);
        }

        entrada.close();

    }

}
