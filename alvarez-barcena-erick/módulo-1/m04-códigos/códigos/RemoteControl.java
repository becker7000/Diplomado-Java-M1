public class RemoteControl {

    boolean encender;
    int volumen;
    int canal;

    RemoteControl(){ //Contructor
        this.encender=false; //Inicia apagado
        this.volumen=50;
        this.canal=1;
    }

    void encender(){ //Metodo encender
        this.encender=true;
    }

    void apagar(){
        this.encender=false;
    }

    void subirVolumen(){ //Sube el volumen siempre y cuando sea menor a 100
        if(this.volumen<100){
            this.volumen=this.volumen+1;
        }
    }

    void bajarVolumen(){ //Baja el volumen siempre y cuando sea mayor a cero
        if(this.volumen>0)
            this.volumen=this.volumen-1;
    }

    void siguienteCanal(){ //Cambia de canal y regresa a 0 si llega a 256
        this.canal=this.canal+1;
        if(this.canal==256){
            this.canal=0;
        }
    }

    void regresarCanal(){ //Regresa canal y regresa a 255 si llega a -1
        this.canal=this.canal-1;
        if(this.canal==-1){
            this.canal=255;
        }
    }

    void describir(){ //Se describe el control
        System.out.printf("\n\n");
        if(this.encender==true)
            System.out.printf("\n\t Estado: encendido");
        else
            System.out.printf("\n\t Estado: apagado");

        System.out.printf("\n\t Volumen: %d",this.volumen);
        System.out.printf("\n\t Canal: %d \n",this.canal);
    }
}
