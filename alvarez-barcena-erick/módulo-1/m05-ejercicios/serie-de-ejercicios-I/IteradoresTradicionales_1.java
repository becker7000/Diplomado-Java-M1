public class IteradoresTradicionales_1 {

    //Sumar los primeros 100 números naturales (1 + 2 + 3 + ... + 99 + 100).

    public static void main(String[] args){

        int contador=1;
        int suma=0;

        System.out.print("\n\t La suma de: ");
        while (contador<=100){
            System.out.printf("%d",contador);
            if(contador<100)
                System.out.print("+");
            suma+=contador;
            contador++;
        }
        System.out.printf(" = %d",suma);
    }

}
