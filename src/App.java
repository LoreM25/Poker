public class App {
    public static void main(String[] args) throws Exception {
        Deck deck = new Deck();

        // Mezclar el deck
        deck.shuffle();
        System.out.println(" ");
        // Primera carta del deck
        deck.head();
        System.out.println(" ");
        // carta al azar
        deck.pick();
        System.out.println(" ");
        // Repartir una mano de cinco cartas
        deck.hand();
        System.out.println(" ");

    }
}
