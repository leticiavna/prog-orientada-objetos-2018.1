import java.util.*;

public class Loja{
    public static void main(String[] args) {
        // Aqui declaramos os tipos de ingresso
        TipoIngresso tipo1 = new TipoIngresso("Pista", 100.00);
        TipoIngresso tipo2 = new TipoIngresso("Cadeira Superior", 200.00);
        TipoIngresso tipo3 = new TipoIngresso("Cadeira Inferior", 150.00);
        TipoIngresso tipo4 = new TipoIngresso("Arquibancada", 120.00);
        TipoIngresso tipo5 = new TipoIngresso("Pista Galáctica", 400.00);

        Ingresso i1 = new Ingresso(tipo1);
        Ingresso i2 = new Ingresso(tipo2);
        Ingresso i3 = new Ingresso(tipo3);
        Ingresso i4 = new Ingresso(tipo4);
        Ingresso i5 = new Ingresso(tipo5);

        // Aqui estamos criando as instâncias (objetos) que vão ser apresentadas no terminal
        Evento evento1 = new Evento("Letícia e Mari dos Teclados", "Born Again", List<i1, i2, i3>);
        evento1.criaLocalData(1995, 1, 1, "Arena Ceres no Cinturão de Asteróide");
        evento1.criaLocalData(2020, 9, 21, "Estádio de Alexandria");
        evento1.criaLocalData(2006, 6, 6, "Broadway de Nova Nova York");
        
        Evento evento2 = new Evento("Let e Thales - Um Encontro Sombrio", "Reborned", List<i1, i4, i5>);
        evento2.criaLocalData(1995, 1, 1, "Arena Ceres");
        evento2.criaLocalData(2020, 9, 21, "Alexandria");
        evento2.criaLocalData(2006, 6, 6, "Broadway");

        // Criamos uma lista de eventos para conseguirmos iterar sobre eles e apresentar
        List<Evento> eventos = new ArrayList<>();
        eventos.add(evento1);
        eventos.add(evento2);

        // Declaramos nossa variável scanner para receber dados de entrada do usuário
        Scanner teclado = new Scanner(System.in);

        // Começamos a iterar e apresentar os dados na tela
        int opcao;
        do {
            // Interface amigável
            System.out.println("Oi, chuchu! Bem vindo à Lojinha dos Bilhetes Intergaláticos :) \n");
            System.out.println("Digite sua opção: ");
            System.out.println("1 - Comprar um Ingresso");
            System.out.println("0 - Sair\n");

            opcao = teclado.nextInt();
            if (opcao == 1 ){
                System.out.println("Escolha um dos Eventos:");
                for (int i = 0 ; i < eventos.size() ; i++){
                    System.out.println("Evento " + ( i + 1) + ": " + eventos.get(i).getInformacoes());
                }
                opcao = teclado.nextInt();
                if ((opcao - 1) > eventos.size()){
                    System.out.println("Evento não existe");
                }
                else {
                    String chosenEvento = eventos.get(opcao-1).getInformacoes();
                    System.out.println("Você escolheu: " + chosenEvento + " Por favor escolha um local e uma data:\n");
                    // alguém coloca aqui numeros nos locais plz
                    eventos.get(opcao - 1).getLocais();

                    opcao = teclado.nextInt();
                    String chosenLocal = opcao;
                    System.out.println("Você escolheu: " + chosenEvento + "em: " + chosenLocal + ". Escolha seu tipo de ingresso: ");
                    switch (opcao) {                        
                        case 1:
                            System.out.println("oii socorro");
                            break;
                    
                        default:
                            break;
                    }
                    
                }
            }
        } while (opcao != 0);
        
    }
    // lembrar de fechar o teclado!!!!!!!!!!!!!!!!!
}