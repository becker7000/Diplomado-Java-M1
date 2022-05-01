public class Switch {
    public static void main(String[] args) {

        int opcion=3; //Variable de control

        switch (3){ //Se recibe la variable de control
            case 1: //Cada case tiene un único valor constante entero
                //Código a ejecutar
                System.out.println("Soy la primera opción");
                break; //Una vez ejecutado el código se escapa de
            //la estructura switch con la sentencia break;
            case 2:
                System.out.println("Soy la segunda opción");
                break;
            case 3:
                System.out.println("Soy la tercera opción");
                break;
            default: //default ejecuta un código de comodín
                // en caso de que el valor de la opcion no entre
                // en alguno de los caso contemplados.
                System.out.println("Soy una opción no contemplada");
        }
    }
}
