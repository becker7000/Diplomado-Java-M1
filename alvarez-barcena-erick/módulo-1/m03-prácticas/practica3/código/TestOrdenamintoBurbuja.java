//Se importal la librería para poder usar la clase Scanner
import java.util.Scanner;

//Nombre de la clase siguiendo el estilo UpperCamellCase
public class TestOrdenamintoBurbuja {
    //Método estatico vacío que recibe un arreglo llamado args para
    //poder ejecutar la clase TestOrdenamientoBurbuja.
    public static void main(String[] args) {
        //Instanciando un objeto de la clase Scanner
        Scanner entrada = new Scanner(System.in);

        //Creando una constante que guardara el tamaño de la lista:
        final int N;
        //Dando una instruccion al ususario:
        System.out.print("\n\tDame el tamaño de la lista: ");
        //Registrando el valor de la constante N con el teclado:
        N = Integer.parseInt(entrada.nextLine());
        //Creando un arreglo de tamaño N de tipo entero:
        int lista[] = new int[N];

        //Ciclo for que llega hasta un elemento antes de la longitud de lista:
        for (int i = 0; i < lista.length; i++) {
            //Se muestra al usuario el elemento que se va a guardar:
            System.out.print("\n\t Valor del elemento "+(i+1)+": ");
            //Se registra con el teclado un elemento del arreglo lista:
            lista[i]=Integer.parseInt(entrada.nextLine());
        }

        //Se crean dos varibles enteras, ´actual´ guardará
        //un elemento de la lista, ´siguiente´ guardará el elemento
        //adyacente a ´actual´ en el arreglo.
        int actual;
        int siguiente;

        //Este ciclo hará el total de pasadas posibles a la lista:
        for (int i = 0; i < lista.length; i++) {
            //Este ciclo hará todas las compracaciones posibles
            //por cada pasada:
            for (int j = 0; j < lista.length-1; j++) {
                //Se asigna temporalmente un valor a ´actual´:
                actual=lista[j];
                //Se asigna temporalmente un valor a ´siguiente´:
                siguiente=lista[j+1];
                //En caso de que el elemento ´actual´que está a la
                //izquierda de ´siguiente´sea menor que ´siguiente´
                //significa que están en desorden y entonces se
                //intercambian sus valores:
                if (actual>siguiente){
                    lista[j]=siguiente;
                    lista[j+1]=actual;
                }
            }
        }

        //Finalmente con un ciclo foreach mostramos en pantalla
        //como quedó la lista ya ordenanda luego del proceso:
        System.out.print("\n\n\tLista de numeros ordenada: ");
        for (int x : lista ) {
            System.out.print(" "+x);
        }
        //Salto de linea para mejor formato de presentación:
        System.out.println("\n");
    }
}
