import java.util.*;

// Essa é a nossa main.

public class Loja{
    public static void main(String[] args) {
        // Aqui declaramos o carrinho 
        Carrinho Cart = new Carrinho(); 

        // Aqui declaramos os tipos de ingresso
        TipoIngresso tipo1 = new TipoIngresso("Pista", 100.00);
        TipoIngresso tipo2 = new TipoIngresso("Cadeira Superior", 200.00);
        TipoIngresso tipo3 = new TipoIngresso("Cadeira Inferior", 150.00);
        TipoIngresso tipo4 = new TipoIngresso("Arquibancada", 120.00);
        TipoIngresso tipo5 = new TipoIngresso("Pista Galáctica", 400.00);

        // aqui instanciamos ingressos 
        Ingresso i1 = new Ingresso(tipo1);
        Ingresso i2 = new Ingresso(tipo2);
        Ingresso i3 = new Ingresso(tipo3);
        Ingresso i4 = new Ingresso(tipo4);
        Ingresso i5 = new Ingresso(tipo5);
        
        // aqui cria-se listas de ingressos para incluir nas instancias de evento
        List<Ingresso> listIngresso1 = new ArrayList<>();
        listIngresso1.add(i1);
        listIngresso1.add(i2);
        listIngresso1.add(i3);

        List<Ingresso> listIngresso2 = new ArrayList<>();
        listIngresso2.add(i1);
        listIngresso2.add(i4);
        listIngresso2.add(i5);
        

        // Aqui estamos criando as instâncias (objetos) que vão ser apresentadas no terminal
        Evento evento1 = new Evento("Letícia e Mari dos Teclados", "Born Again", listIngresso1);
        evento1.criaLocalData(1995, 1, 1, "Arena Ceres no Cinturão de Asteróide");
        evento1.criaLocalData(2020, 9, 21, "Estádio de Alexandria");
        evento1.criaLocalData(2006, 6, 6, "Broadway de Nova Nova York");

        
        Evento evento2 = new Evento("Let e Thales - Um Encontro Sombrio", "Reborned", listIngresso2);
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

            // Aqui é onde vai começar a interaçao com o user
            opcao = teclado.nextInt();
            if (opcao == 1){
                System.out.println("Escolha um dos Eventos:");
                for (int i = 0 ; i < eventos.size() ; i++){
                    System.out.println("Evento " + (i + 1) + ": " + eventos.get(i).getInformacoes());
                }
                opcao = teclado.nextInt();
                if ((opcao - 1) > eventos.size()){
                    System.out.println("Evento não existe");
                }
                else {
                    // aqui ele já escolheu o show e vai escolher a data
                    String chosenEvento = eventos.get(opcao-1).getInformacoes();
                    int numEvento = opcao-1;
                    System.out.println("Você escolheu: " + chosenEvento + " Por favor escolha um local e uma data:\n");
                    // alguém coloca aqui numeros nos locais plz
                    eventos.get(opcao-1).getLocais();

                    // aqui ele tem show, local e data e vai escolher um ingresso
                    opcao = teclado.nextInt();
                    String chosenLocal = eventos.get(numEvento).getLocalEscolhido(opcao-1);
                    int numLocal = opcao-1;
                    System.out.println("Você escolheu: " + chosenEvento + " Em: " + chosenLocal + ". Escolha seu tipo de ingresso: ");
                    //mostra os tipos de ingressos escolhidos
                    eventos.get(numEvento).getIngressosAtuais();

                    
                    // aqui ele tem show, local e data e escolhe tipo ingresso + quantidade
                    opcao = teclado.nextInt();
                    // mudar isso aqui. a classe evento não se responsabiliza por isso
                    eventos.get(numEvento).getTipoIngressoEscolhido(opcao-1);
                    System.out.println("Digite a quantidade: ");
                    int numIngressos = teclado.nextInt();
                    // mudar isso aqui embaixo também. já tem uma quantidade de ingressos na classe QtdIngresso, não é pra ter em evento
                    eventos.get(numEvento).setQtdIngressoEscolhido(numIngressos);
                    
                    // aqui ele confirma a compra
                    System.out.println("Deseja continuar a sua compra? Digite '0' para cancelar ou qualquer outra para continuar.");
                    int confirma = teclado.nextInt();
                    if (confirma == 0) {
                        break;
                    }
                    //Relaciona quantidade de ingressos e o ingresso escolhido na classe QtdCarrinho
                    QtdCarrinho qtd = new QtdCarrinho(eventos.get(numEvento).getIngressos().get(opcao-1), numIngressos);
                    Cart.adicionaNoCarrinho(qtd);
                    Cart.mostraCarrinho();
                    System.out.println("Você tem certeza que quer continuar? Mesmas regras anteriores");
                    confirma = teclado.nextInt();
                    if (confirma == 0){
                        break;
                    }

                    System.out.println("Oba! Vamos continuar. Digite o número do seu cartão:");
                    //int dadosCartao = teclado.nextLine();
                    //if (dadosCartao)
                }
            }
        } while (opcao != 0); // enquanto a primeira resposta não for 0 o sistema roda
        
    }
}
    // lembrar de fechar o teclado!!!!!!!!!!!!!!!!!
