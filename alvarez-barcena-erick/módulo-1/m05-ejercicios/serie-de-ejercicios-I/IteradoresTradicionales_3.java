public class IteradoresTradicionales_3 {

    // Sumar los números del 1 al 100 pero sólo si son múltiplos de 3 o 7.

    public static void main(String[] args){

        int contador=1;
        int suma=0;

        while(contador<=100){
            if(contador%3==0 || contador%7==0){
                System.out.printf("%d",contador);
                if(contador<100)
                    System.out.print("+");
                suma+=contador;
            }
            contador++;
        }
        System.out.printf(" = %d",suma);
    }
}
