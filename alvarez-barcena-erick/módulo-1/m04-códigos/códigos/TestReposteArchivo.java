import java.io.FileNotFoundException;

public class TestReposteArchivo {

    public static void main(String[] args){

        ReporteArchivo reporte01 = new ReporteArchivo("C:\\demo.txt");

        try{
            reporte01.generarReporte();
        }catch (FileNotFoundException e){
            System.out.printf("\n\tEl archivo no existe %s ",e.getMessage());
        }


    }

}
