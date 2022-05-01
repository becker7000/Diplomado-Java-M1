public class TestContador {
    public static void main(String[] args) {

        //Se crean dos objetos (C1,C2) de la clase Contador
        Contador C1 = new Contador(0);
        Contador C2 = new Contador(0);

        //Aplicamos el método incrementar() y decrementar()
        //algunas veces al objeto C1 y C2:

        C1.incrementar(); C1.incrementar();
        C1.decrementar(); C1.incrementar();
        C1.incrementar();

        C2.incrementar(); C2.decrementar();
        C2.incrementar(); C2.incrementar();

        //Imprimimos el valor final de la variable conteo de cada objeto
        //Esto lo logramos gracias al método getConteo()
        System.out.println("C1: "+C1.getConteo());
        System.out.println("C2: "+C2.getConteo());

    }
}
