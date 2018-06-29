import java.text.SimpleDateFormat;
import java.util.*;

public class Evento {
	private String nomeArtista;
	private String turne;
	private List<Data> datas = new ArrayList<>();
	private List<Local> locais = new ArrayList<>();
	private List<Ingresso> ingressos;
	private Ingresso ingressoEscolhido;
	int tipoIngressoEscolhido, qtdIngressoEscolhido;

	// Construtor de Evento
	public Evento(String nomeArtista, String turne, List<Ingresso> ingressos){
		this.nomeArtista = nomeArtista;
		this.turne = turne;
		this.ingressos = ingressos;
	}

	// GETS para retornar os valores da classe
	public String getNomeArtista() {
		return nomeArtista;
	}

	public String getTurne(){
		return this.turne;
	}

	// Retorna todos os locais disponíveis.
	public void getLocais() {
		int tamanhoLista = this.locais.size();
		for(int i = 0; i < tamanhoLista; i++){
			System.out.println("Local " + (i+1) +": "+ this.locais.get(i).getNome() + ", Data: " +
				this.datas.get(i).getData());
		}
		System.out.println("\n");
	}

	// Retorna um único local que é o selecionado
	public String getLocalEscolhido(int i){
		return ("Local: " + this.locais.get(i).getNome() + ", Data: " +
		this.datas.get(i).getData());
	}
	
	// Retorna informações do evento
	public String getInformacoes(){
		return ("Nome: " + getNomeArtista() + " - Turnê: " + getTurne() + ".");
	}

	// Retorna todos os ingressos disponíveis
	public void getIngressosAtuais(){
		int count = 1;
		for (Ingresso i : ingressos){
			System.out.println("Tipo " + count + ": " + i.getTipoIngressonoBilhete() + ", valor: R$" + i.getValorIngressoNoBilhete());
			count++;
		}

	}

	// Função para adicionar locais e datas em um evento (usada na main)
	public void criaLocalData(int ano, int mes, int dia, String local){
		this.datas.add(new Data(dia, mes, ano));
		this.locais.add(new Local(local));
	}

	// Função que retorna o tipo de ingresso escolhido
	public void getTipoIngressoEscolhido(int posIngresso){
		System.out.println("Você escolheu o ingresso: " + ingressos.get(posIngresso).getTipoIngressonoBilhete() + " que custa: " + ingressos.get(posIngresso).getValorIngressoNoBilhete() + ".");
		this.tipoIngressoEscolhido = posIngresso;
	}

	// Funcão que diz a quantidade desejada de ingressos
	public void setQtdIngressoEscolhido(int qtdIngressoEscolhido) {
		this.qtdIngressoEscolhido = qtdIngressoEscolhido;
	}

}
