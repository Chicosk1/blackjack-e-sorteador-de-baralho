public class Carta {
    //Váriaveis
    private String naipeCarta;
    private int valorCarta;

    //Getters
    public String getNaipeCarta() {
        return naipeCarta;
    }
    public int getValorCarta() {
        return valorCarta;
    }

    //Setters
    public void setNaipeCarta(String naipeCarta) {
        this.naipeCarta = naipeCarta;
    }
    public void setValorCarta(int valorCarta) {
        this.valorCarta = valorCarta;
    }

    //Construtor
    public Carta(String naipeCarta, int valorCarta) {
        this.naipeCarta = naipeCarta;
        this.valorCarta = valorCarta;
    }
    
}
