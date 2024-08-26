public class BaralhoEspanhol extends Baralho{
    //Embaralhar Baralho Espanhol
    @Override
    public void embaralhar() {

        super.embaralhar();

        //Atribuição de Naipes e Valores
        for(int i = 1; i <= 7; i++){
            
            super.cartas.add(new Carta("OURO", i));
            super.cartas.add(new Carta("PAUS", i));
            super.cartas.add(new Carta("ESPADAS", i));
            super.cartas.add(new Carta("COPAS", i));

        }
        for(int i = 10; i <= 12; i++){
            
            super.cartas.add(new Carta("OURO", i));
            super.cartas.add(new Carta("PAUS", i));
            super.cartas.add(new Carta("ESPADAS", i));
            super.cartas.add(new Carta("COPAS", i));

        }
        
        super.sortear();

    }
}