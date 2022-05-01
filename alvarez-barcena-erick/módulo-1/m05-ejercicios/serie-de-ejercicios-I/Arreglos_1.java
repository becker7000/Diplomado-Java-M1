public class Arreglos_1 {

    //Crear un arreglo de enteros de tamaño 5 y poner los números 5, 2, 3, 1, 4 respectivamente.
    //Imprime el arreglo hacía enfrente (5 2 3 1 4)
    //Imprime el arreglo hacía atrás (4 1 3 2 5)

    public static void main(String[] args){

        int[] numeros= new int[]{5,2,3,1,4};

        //Imprimiendo el arreglo hacia enfrente:
        System.out.print("\n\t---Hacia enfrente---");
        for(int i=0;i<numeros.length;i++)
            System.out.printf("\n\t %d",numeros[i]);

        //Imprimiedo el arreglo hacia atrás:
        System.out.print("\n\t---Hacia atrás---");
        for(int i=(numeros.length-1);i>=0;i--)
            System.out.printf("\n\t %d",numeros[i]);

    }

}
