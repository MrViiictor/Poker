public class Mazo {
    private Carta[] cartas;
    private int numCartas;
    public Mazo (int numBar){
        numCartas = 52 * numBar;
        cartas = new Carta[numCartas];
        int counter = 0;
        for (int i = 0; i <= numBar; i++){
            for (int j = 0; j < Carta.PALOS.length; j++){
                for (int k = 1; k < 14; k++){
                    cartas[counter] = new Carta(k, Carta.PALOS[j]);
                    counter++;
                }
            }
        }
    }

    public void barajar(){
        for (int i = 0; i < cartas.length * 5; i++){
            int n1 = (int) (Math.random() * cartas.length);
            int n2 = (int) (Math.random() * cartas.length);
            Carta temp = cartas[n1];
            cartas[n1] = cartas[n2];
            cartas[n2] = temp;
        }
    }

    public Carta extraerCarta(){
        Carta carta = cartas[numCartas - 1];
        numCartas--;
        return carta;
   }

   @Override
    public String toString(){
        String s = "";

   }

}
