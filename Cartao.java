public class Cartao {
    private String numCartao;
    private String nomePessoa;
    private String validade;
    private String codSeguranca;

    // Construtor de Cartão
    public Cartao() {
    }

    // SETS para a criação e validação do cartão
	public void setCodSeguranca(String codSeg) {
		this.codSeguranca = codSeg;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}


	// método que valida os dados do cartão
    public boolean validaDadosCartao() {
        return true;
    }
    
}