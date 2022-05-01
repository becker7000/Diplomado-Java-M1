public class Contador {

    //Variable conteo de tipo entero
    private int conteo; //Atributo privado.

    //Método constructor que inicializa el valor de la variable conteo.
    public Contador(int conteo) {
        this.conteo = conteo; //Se asigna el valor de entrada conteo
    } // a la variable interna this.conteo

    public void incrementar(){ //Método que no devuelve ningun valor.
        conteo++; //pero modifica la variable conteo sumandole 1.
    }

    public void decrementar(){ ////Método que no devuelve ningun valor.
        conteo--;//pero modifica la variable conteo restandole 1
    }

    public int getConteo() { //Método de tipo getter
        return conteo; // devuelve el valor de conteo. (Sólo lectura)
    }

}
