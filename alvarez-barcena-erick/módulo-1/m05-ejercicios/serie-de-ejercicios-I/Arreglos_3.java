import java.util.Scanner;

public class Arreglos_3 {

    //Crear un arreglo de tamaño N dado por el usuario.
    //Leer cada posición del arreglo desde el usuario
    //Imprimir el arreglo
    //Preguntarle al usuario por dos posiciones del arreglo
    //Intercambiar las dos posiciones
    //Imprimir el arreglo nuevamente

    public static void main(String[] args){

        //Creando arreglo:
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\t Escribe un tamaño para el arreglo: ");
        int N = entrada.nextInt(); entrada.nextLine();
        int[] numeros = new int[N];

        //Guardando cada valor del arreglo:
        for(int i=0;i<numeros.length;i++){
            System.out.printf("\n\t num[%d] = ",i);
            numeros[i]= entrada.nextInt();
        }

        //Imprimiendo el arreglo:
        System.out.println("\tEstos son los valores guardados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("\n\t num[%d] = %d ",i,numeros[i]);
        }

        //Se piden dos posiciones al usuario:
        System.out.println("\n\tA continuación escribe dos posiciones de la lista:");
        System.out.print("\tPosicion A: ");
        int posA = entrada.nextInt(); entrada.nextLine();
        System.out.print("\n\tPosicion B: ");
        int posB = entrada.nextInt(); entrada.nextLine();

        System.out.println("\n\t Las posiciones A y B se intercambiaron. ");

        //Intercambiando valores en el arreglo:
        int aux=numeros[posA];
        numeros[posA]=numeros[posB];
        numeros[posB]=aux;

        //Imprimiendo el arreglo de nuevo:
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("\n\t num[%d] = %d ",i,numeros[i]);
        }

    }

}
