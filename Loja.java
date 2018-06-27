import java.util.*;

public class Loja{
    public static void main(String[] args) {
        Evento evento1 = new Evento("Letícia e Mari dos Teclados", "Born Again");
        evento1.criaLocalData(1995, 1, 1, "Arena Ceres no Cinturão de Asteróide");
        evento1.criaLocalData(2020, 9, 21, "Estádio de Alexandria");
        evento1.criaLocalData(2006, 6, 6, "Broadway de Nova Nova York");
        
        Evento evento2 = new Evento("Let e Thales - Um Encontro Sombrio", "Reborned");
        evento2.criaLocalData(1995, 1, 1, "Arena Ceres no Cinturão de Asteróide");
        evento2.criaLocalData(2020, 9, 21, "Estádio de Alexandria");
        evento2.criaLocalData(2006, 6, 6, "Broadway de Nova Nova York");

        List<Evento> eventos = new ArrayList<>();
        eventos.add(evento1);
        eventos.add(evento2);

        Scanner teclado = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Oi, chuchu! Bem vindo à Lojinha dos Bilhetes Intergaláticos :)");
            System.out.println("Digite sua opção:");
            System.out.println("1 - Comprar um Ingresso");
            System.out.println("0 - Sair");
            opcao = teclado.nextInt();
            if (opcao == 1 ){
                System.out.println("Escolha um dos Eventos:");
                for (int i = 0 ; i < eventos.size() ; i++){
                    System.out.println("Evento " + ( i + 1) + ": " + eventos.get(i).getInformacoes());
                }
                opcao = teclado.nextInt();
                if ((opcao - 1) > eventos.size()){
                    System.out.println("Evento não existe");
                } else {
                    eventos.get(opcao - 1).getLocais();
                    System.out.println("Você escolheu esse evento. Por favor escolha um local e uma data:");
                    
                }
            }
        } while (opcao != 0);
        
    }
}