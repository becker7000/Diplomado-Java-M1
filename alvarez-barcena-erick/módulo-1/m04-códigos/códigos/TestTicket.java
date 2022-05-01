import java.util.Date;

public class TestTicket {

    public static void main(String[] args){

        Ticket ticket = new Ticket(
                new Date(),
                "Parque Lindavista",
                "Julio Perez",
                "Rafael Marquez",
                "900008765A8000",
                new String[]{
                        "Papas     (1) $15.54",
                        "Gansito   (2) $14.23",
                        "Coca Cola (2) $45.76",
                        "Doritos   (1) $16.32",
                }
        );

        System.out.println(ticket);
        //Ticket is the same that Ticket.toString()
    }
}
