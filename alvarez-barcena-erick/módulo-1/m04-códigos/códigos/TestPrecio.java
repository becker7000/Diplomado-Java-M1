public class TestPrecio {

    public static void main(String[] args){

        Producto producto1 = new Producto("1234","Agua",10.5,100);
        Producto producto2 = new Producto("zxs1209", "Gansito",14.9,100);

        Libro libro1 = new Libro("abc123","El llano en llamas","Juan Rulfo",2001);
        Libro libro2 = new Libro("0987zxs","1984","George Orwell",1960);
        Libro libro3 = new Libro("5432qwe","Alicia en el pais de las maravillas","Lewis Carroll",2005);

        /*
        * Un objeto interfaz es un objeto limitado a la interfaz,
        * es decir, hay un `objeto original` (producto1, producto2,...)
        * que será transformado en un `objeto limitido`
        * el cual solo tendra los metodos definidos por la interfaz
        * a este objeto limitado le llamaremos el `objeto interfaz` (Precio1, Precio2,...)
        * y solo podremos utilizar los métodos que se definieron en la interfaz.
        * */

        IPrecio precio1 = producto1;
        IPrecio precio2 = producto2;
        IPrecio precio3 = libro1;
        IPrecio precio4 = libro2;
        IPrecio precio5 = libro3;

        /*
        * A los objetos originales les podemos mandar a llamar a sus métodos.
        * */

        producto1.agregarExistencia();
        producto2.quitarExistencia();
        libro1.getAutor();
        libro2.leer();
        libro3.getPrecio();

        /*
        * A los objetos limitados (objetos interfaz) podemos mandar a llamar
        * a los metodos que estan definidos en la interfaz solamente.
        * Es decir, estos objetos se vuelven objetos especificos de la interfaz
        * y sirven para poder manipularlos a alto nivel, si nos interesa su origen
        * o sus metodos y atributos originales.
        * */

        precio1.getPrecio();
        precio2.getPrecio();
        precio3.getPrecio();
        precio4.getPrecio();
        precio5.getPrecio();

        /*
        * Quiere decir, que apartir de ahora, podemos crear sistemas basados en las
        * interfaces, manipulando solamente objetos interfaz, sin que tengamos los
        * detalles de su procedencia o detalles de otras cosas que escapen de la
        * interfaz.
        * Por ejemplo, podríamos crear una funcion que reciba dos precios y determine
        * el mayor de ellos, o podríamos crear una función que tome una lista de precios
        * y nos devuelva el total. Sin importar si los precios venían de una clase u otra.
        * Esto generaliza sistemas para que podamos basarnos en las interfaces y no en las entidades
        * permitiéndonos manipular múltiples entidades como una única interfaz.
        * Esto es una especie de polimorfismo a nivel interfaz.
        *  */

        /*
        * Producto -> IPrecio
        * Libro -> IPrecio
        * Mueble -> IPrecio
        * ... -> IPrecio
        * */

        ReportePrecios reporte = new ReportePrecios();

        reporte.agregaPrecio(precio1);
        reporte.agregaPrecio(precio2);
        reporte.agregaPrecio(libro1);
        reporte.agregaPrecio(libro2);
        reporte.agregaPrecio(libro3);

        reporte.generarReporte();

        ReportePrecios reporte2 = new ReportePrecios();

        reporte2.agregaPrecio(precio1);
        reporte2.agregaPrecio(precio2);

        reporte2.generarReporte();

        ReportePrecios reporte3 = new ReportePrecios();

        reporte3.agregaPrecio(libro1);
        reporte3.agregaPrecio(libro2);
        reporte3.agregaPrecio(libro3);

        reporte3.generarReporte();

    }

}
