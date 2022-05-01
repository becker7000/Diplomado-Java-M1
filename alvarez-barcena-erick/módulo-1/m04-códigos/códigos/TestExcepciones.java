import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestExcepciones{

    //Método publico estático.
    //que devuelve void(sin retorno)
    //recibe un arreglo de argumentos(Strings[] args)
    //Denominado PUNTO DE ENTRADA / PUNTO DE EJECUCION / METODO DE INICIO

    public static void main(String[] agrs){

        File file = new File("C:\\demo.txt");

        System.out.printf("\n\tArchivos: %s",file.getName());
        System.out.printf("\n\tRuta absoluta: %s",file.getAbsolutePath());
        System.out.printf("\n\tExiste el archivo? %B",file.exists());
        System.out.printf("\n\tEs un archivo? %B", file.isFile());
        System.out.printf("\n\tSe puede leer? %B",file.canRead());

        try{
            Scanner entrada = new Scanner(file);

            while(entrada.hasNextLine()){
                String line=entrada.nextLine();
                System.out.println("\n\t"+line);
            }

            entrada.close();
        } catch (FileNotFoundException e){

            System.out.printf("\n\tEl archivo no existe %s",e.getMessage());

        } catch (Exception e) {
        System.out.printf("\n\tError inesperado %s",e.getMessage());

        }finally {
        System.out.printf("\n\tFin del programa ");
        }
    }
}

