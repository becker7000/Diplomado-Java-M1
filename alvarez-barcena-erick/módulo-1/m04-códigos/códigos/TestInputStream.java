import java.io.*;

public class TestInputStream{

    public static void main(String[] args) throws IOException {

        File fileA = new File("C:\\demo.txt");

        //Este produce un FileNotFoundException
        FileInputStream fin = new FileInputStream(fileA);

        File fileB = new File("C:\\demo_copia.txt");
        FileOutputStream fout = new FileOutputStream(fileB);

        int contador=0;

        int b;
        while((b=fin.read())!=-1){

        System.out.printf("[%d]",b);
        if((contador+1)%20==0){
        System.out.println();
        }
        contador++;
        fout.write(b); //Escribimos  un archivo 2
        }

        System.out.printf("\n\t Total bytes: %d",contador);
        System.out.println();

        //IOexception
        fin.close();
        fout.close();

        }

}