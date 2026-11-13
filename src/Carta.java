import java.lang.reflect.Array;

public class Carta {
    private int numero;
    private String palo;
    public static String[] PALOS = {"♠", "♥", "♦", "♣"};

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString(){
        return numero + "de" + palo;
    }

    public String getPalo() {
        return palo;
    }
}
