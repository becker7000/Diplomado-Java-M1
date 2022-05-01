public class Carta {

    private ETipoDeCarta tipo;
    private EColorDeCarta color;
    private ENumeroDeCarta numero;

    public Carta(ETipoDeCarta tipo, EColorDeCarta color, ENumeroDeCarta numero) {
        this.tipo = tipo;
        this.color = color;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "tipo=" + tipo +
                ", color=" + color +
                ", numero=" + numero +
                '}';
    }
}
