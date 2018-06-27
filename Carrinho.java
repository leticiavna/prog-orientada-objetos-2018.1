import java.util.*;

public class Carrinho {
    private double totalIngressos;
    private List<QtdCarrinho> itensCarrinho;

    // Construtor da classe Carrinho
    public Carrinho(){
        itensCarrinho = new ArrayList<>();
    }

    // GETS para o carrinho, retorna quantidade total, quantidade de itens
        
	public double getTotalIngressos() {
		return calculaValorTotalIngressos();
	}

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
}