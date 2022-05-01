import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReporteArchivo{

    String nombre; //Nombre de un archivo

    public ReporteArchivo(String nombre){
        this.nombre=nombre;
    }

    //Desencadenamos la excepcion sin tener que controlarla de alguna manera
    public void generarReporte() throws FileNotFoundException {
        File file = new File(this.nombre);

        System.out.printf("\n\tArchivos: %s",file.getName());
        System.out.printf("\n\tRuta absoluta: %s",file.getAbsolutePath());
        System.out.printf("\n\tExiste el archivo? %B",file.exists());
        System.out.printf("\n\tEs un archivo? %B", file.isFile());
        System.out.printf("\n\tSe puede leer? %B",file.canRead());

        int contador=0;

        Scanner entrada=new Scanner(file);

        while(entrada.hasNextLine()){

            entrada.nextLine();
            contador++;
        }

        entrada.close();

        System.out.printf("\n\tTotal de lineas: %d",contador);
    }


}
