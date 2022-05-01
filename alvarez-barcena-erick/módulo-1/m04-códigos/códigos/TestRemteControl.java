public class TestRemteControl {
    public static void main(String[] args){
        //1. Inciando control
        RemoteControl control = new RemoteControl();
        //2. Describiendo control
        control.describir();
        //3. Encender control
        control.encender();
        //4. Describir control
        control.describir();
        //5. Subir volumen
        control.subirVolumen();
        //6. Cambiar canal arriba
        control.siguienteCanal();
        //7. Describiendo control
        control.describir();
        //8. Regresar canal
        control.regresarCanal();
        //9. Describiendo control
        control.describir();
        //10. Apagando control
        control.apagar();
        //11. Describir control
        control.describir();
    }
}
