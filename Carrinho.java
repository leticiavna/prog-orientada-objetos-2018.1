import java.util.*;

public class Carrinho {
	private double totalIngressos;
	private List<QtdCarrinho> itensCarrinho;

	// Construtor da classe Carrinho
	public Carrinho(){
		itensCarrinho = new ArrayList<>();
	}

	// GETS para o carrinho, retorna quantidade total, quantidade de itens
	public void getItensCarrinho(){
		for(QtdCarrinho item: itensCarrinho){
			System.out.println(item.getIngresso().getInformacoesBilhete() + " " + item.getNomeIngresso() + ", "
			 + item.getQuantidadeIngresso() +", R$: " + item.getIngresso().getValorIngressoNoBilhete());
		}
	}

	// Essa função adiciona itens no carrinho.
	public void adicionaNoCarrinho(QtdCarrinho Cart){
		itensCarrinho.add(Cart);
	}
	
	// Essa função pega todos os ingressos e seus valores (já com a quantidade multiplicada) e retorna o valor total.
	private double getValorTotalIngressos(){
		totalIngressos = 0.0;
		for(int i = 0; i < itensCarrinho.size(); i++){
			totalIngressos += itensCarrinho.get(i).getValorDoTipo();
		}
		return totalIngressos;
	}

	public void mostraCarrinho(){
		System.out.println("\n");
		System.out.println("*************** SEU CARRINHO ***************");
		System.out.println("NOME DO EVENTO, TIPO DE INGRESSO, QUANTIDADE, VALOR UNITÁRIO");
		this.getItensCarrinho();

		System.out.println("VALOR TOTAL: R$ " + this.getValorTotalIngressos());
		System.out.println("*************** SEU CARRINHO ***************");
		System.out.println("\n");
	}

	/*public void limpaCarrinho(){
		itensCarrinho.clear();
		totalIngressos = 0.0;
	} */
}