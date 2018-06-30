import java.util.List;

public class Ingresso{
	private TipoIngresso tipo;
	private Evento nome;

	// construtor da classe Ingresso
	public Ingresso(TipoIngresso tipo) {
		this.setTipo(tipo);
	}
	// SETS para os tipos de ingresso
	public void setTipo(TipoIngresso tipo) {
		this.tipo = tipo;
	}

	public void setEvento(Evento nome) {
		this.nome = nome;
	}

	// GETS para retornar o valor dos atributos (obedecendo o encapsulamento)
	public String getTipoIngressonoBilhete() {
		return tipo.getTipoIngresso();   
	}
	
	public String getInformacoesBilhete(){
		return nome.getInformacoes();
	}
	public double getValorIngressoNoBilhete() {
		return tipo.getValorIngresso();
	}
}