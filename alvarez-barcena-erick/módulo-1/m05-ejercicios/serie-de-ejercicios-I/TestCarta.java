import java.util.Scanner;

public class TestCarta {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ETipoDeCarta tipo=ETipoDeCarta.DIAMANTES;
        EColorDeCarta color = EColorDeCarta.NEGRA;
        ENumeroDeCarta numero = ENumeroDeCarta.KING;
        int opcion;

        System.out.print("\n\t Pide una carta.");

        // Menú para el tipo de carta:
        // i) Tipo de carta (corazones, picas, trébol y diamantes)

        System.out.println("\t Selecciona el tipo:");
        System.out.println("\t 1) Corazones");
        System.out.println("\t 2) Picas");
        System.out.println("\t 3) Trebol");
        System.out.println("\t 4) Diamantes");
        System.out.print("\t => ");
        opcion= entrada.nextInt(); entrada.nextLine();

        switch (opcion){
            case 1 -> tipo = ETipoDeCarta.CORAZONES;
            case 2 -> tipo = ETipoDeCarta.PICAS;
            case 3 -> tipo = ETipoDeCarta.TRÉBOL;
            case 4 -> tipo = ETipoDeCarta.DIAMANTES;
        }

        // Menú para el color
        // ii)  Color de carta (roja, negra)

        System.out.println("\t Selecciona el color:");
        System.out.println("\t 1) Roja");
        System.out.println("\t 2) Negra");
        System.out.print("\t => ");
        opcion= entrada.nextInt(); entrada.nextLine();

        switch (opcion){
            case 1 -> color = EColorDeCarta.ROJA;
            case 2 -> color = EColorDeCarta.NEGRA;
        }

        // Menú para el número de carta:
        // iii) Número de carta (az, dos, tres, ..., diez, jocker, queen, king)

        System.out.println("\t Selecciona el número:");
        System.out.println("\t 1) Az");
        System.out.println("\t 2) Dos");
        System.out.println("\t 3) Tres");
        System.out.println("\t 4) Cuatro");
        System.out.println("\t 5) Cinco");
        System.out.println("\t 6) Seis");
        System.out.println("\t 7) Siete");
        System.out.println("\t 8) Ocho");
        System.out.println("\t 9) Nueve");
        System.out.println("\t 10) Diez");
        System.out.println("\t 11) Joker");
        System.out.println("\t 12) Queen");
        System.out.println("\t 13) King");
        System.out.print("\t => ");
        opcion= entrada.nextInt(); entrada.nextLine();

        switch (opcion){
            case 1 -> numero = ENumeroDeCarta.AZ;
            case 2 -> numero = ENumeroDeCarta.DOS;
            case 3 -> numero = ENumeroDeCarta.TRES;
            case 4 -> numero = ENumeroDeCarta.CUATRO;
            case 5 -> numero = ENumeroDeCarta.CINCO;
            case 6 -> numero = ENumeroDeCarta.SEIS;
            case 7 -> numero = ENumeroDeCarta.SIETE;
            case 8 -> numero = ENumeroDeCarta.OCHO;
            case 9 -> numero = ENumeroDeCarta.NUEVE;
            case 10 -> numero = ENumeroDeCarta.DIEZ;
            case 11 -> numero = ENumeroDeCarta.JOCKER;
            case 12 -> numero = ENumeroDeCarta.QUEEN;
            case 13 -> numero = ENumeroDeCarta.KING;
        }

        System.out.print("\n\tTu carta es: ");
        Carta carta = new Carta(tipo,color,numero);
        System.out.println(carta);

    }

}
