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
		return totalIngressos;
	}

    public void adicionaNoCarrinho(QtdCarrinho item){
        itens.add(item);
    }
    
    private double calculaValorTotalIngressos(){
        double total = 0.0;
        for(QtdCarrinho item: itens){
            total += item.calculaSubtotal();
        }
        return total;
    }
}