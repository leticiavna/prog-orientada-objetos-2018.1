public class QtdCarrinho {
    // Classe para adicionar quantidades de ingresso (tipos variados) no carrinho e calcular o valor total.

    private Ingresso ingresso;
    private int quantidade;

    // Construtor da classe QtdCarrinho
    // recebe um ingresso e a quantidade de ingressos iguais a ele
    public QtdCarrinho(Ingresso ingresso, int quantidade){
        this.ingresso = ingresso;
        this.quantidade = quantidade;
    }


    // GETS para retornar os valores da classe
    public Ingresso getIngresso(){
        return ingresso;
    }

    public int getQuantidadeIngresso(){
        return quantidade;
    }

}