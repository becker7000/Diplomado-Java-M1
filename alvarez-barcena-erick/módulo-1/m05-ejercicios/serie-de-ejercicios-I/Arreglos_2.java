import java.util.Scanner;

public class Arreglos_2 {

    //Crear un arreglo de tamaño N dado por el usuario.
    //Leer cada posición del arreglo desde el usuario.
    //Sumar todos los valores del arreglo e imprimirlos.

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("\n\t Escribe el tamaño del arreglo: ");
        int N = entrada.nextInt(); entrada.nextLine();

        int[] numeros = new int[N];

        //Leyendo los valores del arreglo:
        for(int i=0;i<numeros.length;i++){
            System.out.printf("\n\t numero[%d] = ",i);
            numeros[i] = entrada.nextInt();
        }

        int suma=0;

        //Sumando los valores del arreglo:
        for(int i=0;i<numeros.length;i++)
            suma+=numeros[i];

        System.out.printf("\n\t La suma es: %d",suma);

        entrada.close();
    }

}
