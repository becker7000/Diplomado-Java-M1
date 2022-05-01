public class IteradoresTradicionales_2 {

    //Imprimir la lista de los primeros 100 números naturales poniendo el número y su complemento a 100.
    //Ejemplo: 1 - 99, 2 - 98, 3 - 97, ..., 99 - 1, 100 - 0

    public static void main(String[] args){

        int contador=1;

        while(contador<=100){
            System.out.printf(" %d - %d",contador,(100-contador));
            if(contador<100)
                System.out.print(",");
            contador++;
        }

    }

}
