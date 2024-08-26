import java.util.ArrayList;
import java.util.Collections;
public class Baralho {
    //ArrayList dos náipes das cartas
    public final ArrayList<Carta> cartas = new ArrayList<Carta>();

    //Método PAI para embaralhar o baralho
    public void embaralhar() {
        this.cartas.clear();
    }

    //Método PAI para sortear o baralho
    public void sortear() {
        Collections.shuffle(cartas);
    }

    //Método para exibir o naipe e valor das cartas
    public void print() {
        for (Carta carta : cartas){
            System.out.println("\n" + carta.getValorCarta() + " de " + carta.getNaipeCarta());
        }
    }
}
