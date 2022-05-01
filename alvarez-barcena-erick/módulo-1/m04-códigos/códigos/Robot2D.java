public class Robot2D {

    String nombre;
    int x;
    int y;
    char orientacion; //'N','E','S','O'

    Robot2D(String _nombre){
        this.nombre=_nombre;
        this.x=0;
        this.y=0;
        this.orientacion='E';
    }

    void avanzar(){
        if(this.orientacion=='N')
            this.y=this.y+1;
        else if(this.orientacion=='E')
            this.x=this.x+1;
        else if(this.orientacion=='S')
            this.y=this.y-1;
        else if(this.orientacion=='O')
            this.x=this.x-1;
        else
            System.out.printf("\n\t No conozco esa orientacion :C");
    }

    void girarSentidoManecillas(){
        if(this.orientacion=='N')
            this.orientacion='E';
        else if(this.orientacion=='E')
            this.orientacion='S';
        else if(this.orientacion=='S')
            this.orientacion='O';
        else if(this.orientacion=='O')
            this.orientacion='N';
        else
            System.out.printf("\n\t No conozco esa orientacion :C");
    }

    void girarSentidoContraManecillas(){
        if(this.orientacion=='N')
            this.orientacion='O';
        else if(this.orientacion=='E')
            this.orientacion='N';
        else if(this.orientacion=='S')
            this.orientacion='E';
        else if(this.orientacion=='O')
            this.orientacion='S';
        else
            System.out.printf("\n\t No conozco esa orientacion :C");
    }

    void describir(){
        System.out.printf("\n\n");
        System.out.printf("\n\tDESCRIPCION: ");
        System.out.printf("\n\tNombre: %s",this.nombre);
        System.out.printf("\n\tPosicion: (%d,%d)",this.x,this.y);
        System.out.printf("\n\tOrientacion: %c",this.orientacion);
        System.out.printf("\n\n");
    }
}

