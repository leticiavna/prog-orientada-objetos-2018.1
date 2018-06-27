public class Cartao {
    private int numCartao = new int[16];
    private String nomePessoa;
    private Data validade;
    private int codSeguranca;

    // Construtor de Cartão
    public Cartao(int numCartao, String nomePessoa, Data validade, int codSeguranca) {
        this.numCartao = numCartao;
        this.nomePessoa = nomePessoa;
        this.validade = validade;
        this.codSeguranca = codSeguranca;
    }

    
    // método que valida os dados do cartão
    public boolean validaDadosCartao() {
        return true;
    }
    
}