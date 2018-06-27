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
            System.out.println(item);
        }
    }
	public double getTotalIngressos() {
		return calculaValorTotalIngressos();
	}

    // Essa função adiciona itens no carrinho.
    public void adicionaNoCarrinho(QtdCarrinho Cart){
        itensCarrinho.add(Cart);
    }
    
    // Essa função pega todos os ingressos e seus valores (já com a quantidade multiplicada) e retorna o valor total.
    private double calculaValorTotalIngressos(){
        double totalIngressos = 0.0;
        for(int i = 0; i < itensCarrinho.size(); i++){
            totalIngressos += itensCarrinho.get(i).getValorDoTipo();
        }
        return totalIngressos;
    }

    public void mostraCarrinho(){
        System.out.println("**** SEU CARRINHO ****");
        System.out.println("Produto e valor:");
        this.getItensCarrinho();

        System.out.println("Valor Total:");
        System.out.println(this.getTotalIngressos());

    }
}