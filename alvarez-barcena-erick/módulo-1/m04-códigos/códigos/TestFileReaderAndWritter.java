import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestFileReaderAndWritter {

    public static void main(String[] args) throws FileNotFoundException {

        File fileA = new File("C:\\Demo.txt");
        FileReader reader= new FileReader(fileA);

        Scanner entrada=new Scanner(reader);
        int n = entrada.nextInt(); entrada.nextLine();

        for(int i=0;i<n;i++){
            int x = entrada.nextInt();
            int y = entrada.nextInt();
            int z = entrada.nextInt(); entrada.nextLine();

            System.out.printf("\n\t x=%d, y=%d, z=%d Iteracion %d",x,y,z,i);
        }

        System.out.println();
        entrada.close();

        reader.close();
    }
}
