class Card {
    public static String[] Palo = {"tréboles", "corazones", "picas", "diamantes"};
    public static String[] Color = {"negro", "rojo"};
    public static String[] Valor = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

    private String palo;
    private String color;
    private String valor;

    public Card(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
        this.color = determinarColor(palo);
    }

    private String determinarColor(String palo) {
        if (palo.equals("corazones") || palo.equals("diamantes")) {
            return "rojo";
        } else {
            return "negro";
        }
    }    

    public String toString() {
        return "{" +  palo + "," + color + "," + valor + "}";
    }
}
}
