public class Cartao {
	private String numCartao;
	private String nomePessoa;
	private String validade;
	private String codSeguranca;

	// Construtor de Cartão
	public Cartao() {
	}

	// SETS para a criação e validação do cartão

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public void setCodSeguranca(String codSeg) {
		this.codSeguranca = codSeg;
	}

	// método que valida os dados do cartão
	private boolean validaDadosCartao() {
		if (((this.numCartao instanceof String) && (this.numCartao.length() == 16)) &&
			 (this.nomePessoa instanceof String) && 
			 ((this.codSeguranca instanceof String) && (this.codSeguranca.length() == 3)) &&
			 ((this.validade instanceof String) && (this.validade.length() == 5))) {
			return true;
		}
		else return false;
	}
	
	public boolean cartaoValido(){
		return this.validaDadosCartao();
	}
}