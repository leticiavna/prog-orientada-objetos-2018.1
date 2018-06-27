public class Cartao {
    private String numCartao;
    private String nomePessoa;
    private String validade;
    private String codSeguranca;

    // Construtor de Cartão
    public Cartao(String numCartao, String nomePessoa, String validade, String codSeguranca) {
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