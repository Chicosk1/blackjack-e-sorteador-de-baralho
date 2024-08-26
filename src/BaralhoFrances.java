public class BaralhoFrances extends Baralho{
    //Embaralhar Baralho Frances
    @Override
    public void embaralhar() {

        super.embaralhar();

        //Atribuição de Naipes e Valores
        for(int i = 1; i <= 13; i++){
            
            super.cartas.add(new Carta("OURO", i));
            super.cartas.add(new Carta("PAUS", i));
            super.cartas.add(new Carta("ESPADAS", i));
            super.cartas.add(new Carta("COPAS", i));

        }

        super.sortear();

    }
}
