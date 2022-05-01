public class While {
    public static void main(String[] args) {
        //Variable que acumula la suma
        int suma=0;
        //Variable que toma valores enteros
        int contador=1;
        //Mientras el contador sea menor o igual a 100
        while(contador<=10){ //Inicia el ciclo while
            suma+=contador; //Intrucción 1
            contador++; //Instrucción 2
        }
        //Se muestra en consola un mensaje.
        System.out.println("La suma de los enteros del 1 al 10 es: "+suma);
    }
}
