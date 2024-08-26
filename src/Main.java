import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        //Váriaveis e inicialização do Scanner
        Baralho br = null;
        int tipo, finalidade,valorFinal = 0;
        String continuarJogo;
        boolean validacao = true;
        Scanner leitor = new Scanner(System.in);

        //Mensagem principal do sistema
        System.out.println("Escolha o tipo de baralho: ");
        System.out.println("1-Espanhol        2-Frances");
        tipo = leitor.nextInt();

        //Validação para impressão do baralho
        if (tipo == 1) {
            br = new BaralhoEspanhol();
        }else if (tipo == 2) {
            br = new BaralhoFrances();
        }else{
            System.out.println("Tipo inválido ou inexistente.");
        }

        br.embaralhar();//Método para embaralhar o baralho

        System.out.println("Você deseja jogar BlackJack (1) ou Sortear uma Carta (2)?");
        finalidade = leitor.nextInt();

        
        if(finalidade == 2){//Sortear Carta
            //Mensagens de validações para o usuário
            System.out.println("O usuário escolheu o baralho: " + br.getClass().getSimpleName());
            System.out.println("Sorteando...");
            if (!br.cartas.isEmpty()) {
                Carta carta = br.cartas.get(0);
                System.out.println("Saiu " + carta.getNaipeCarta() + " de " + carta.getValorCarta());
                br.cartas.remove(0);
                System.out.println("Restaram " + br.cartas.size() + " cartas.");
            } else {
                System.out.println("O baralho está vazio.");
            }
        }else if(finalidade == 1){//BlackJack
            System.out.println("O usuário escolheu o baralho: " + br.getClass().getSimpleName());
            while(validacao){
                br.embaralhar();
                Carta carta = br.cartas.get(0);
                System.out.println("Valor retirado: "+carta.getValorCarta());
                valorFinal = valorFinal + carta.getValorCarta();
                System.out.println("Valor total: " + valorFinal);
                System.out.println("Deseja continuar? (S/N)");
                continuarJogo = leitor.next();
                if(continuarJogo.equalsIgnoreCase("N")){
                    validacao = false;
                }
            }
            if(valorFinal == 21){
                System.out.println("Você retirou o valor: " + valorFinal + " e ganhou o jogo!");
            }else{
                System.out.println("Você retirou o valor: " + valorFinal + " e perdeu o jogo!");
            }
        }else{//Valor Inválido
            System.out.println("Jogo inválido ou inexistente.");
        }

        //Fechando o scanner
        leitor.close();
    }
}
