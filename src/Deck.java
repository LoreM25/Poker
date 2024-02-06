import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cartas;

    public Deck() {
        cartas = new ArrayList<>();
        iniciarDeck();
    }

    private void iniciarDeck() {
        for (String palo : Card.Palo) {
            for (String valor : Card.Valor) {
                cartas.add(new Card(palo, valor));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cartas);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        Card primercarta = cartas.remove(0);
        System.out.println(primercarta);
        System.out.println("Quedan " + cartas.size() + " cartas en el Deck.");
    }

    public void pick() {
        int randomIndex = (int) (Math.random() * cartas.size());
        Card pickedCard = cartas.remove(randomIndex);
        System.out.println(pickedCard);
        System.out.println("Quedan " + cartas.size() + " cartas en el Deck.");
    }

    public void hand() {
        for (int i = 0; i < 5; i++) {
            Card dealtCard = cartas.remove(0);
            System.out.println(dealtCard);
        }
        System.out.println("Quedan " + cartas.size() + " cartas en el Deck.");
    }
}
