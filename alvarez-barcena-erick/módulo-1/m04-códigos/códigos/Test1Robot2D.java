
public class Test1Robot2D {

    public static void main(String[] args){
        // 1. Crear Robot
        // 2. Ajustando posiciones iniciales
        Robot2D becker = new Robot2D("becker");

        // 3. Describir robot
        becker.describir();

        // 4. Girar el robot
        becker.girarSentidoManecillas();

        // 5. Describir robot
        becker.describir();

        // 6. Avanzar robot
        becker.avanzar();

        // 7. Describir robot
        becker.describir();

        // 8. Girar robot
        becker.girarSentidoManecillas();

        // 9. Describir robot
        becker.describir();

        // 10. Avanzar robot
        becker.avanzar();

        // 11. Describir robot
        becker.describir();

    }
}
