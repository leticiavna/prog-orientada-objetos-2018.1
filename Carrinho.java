import java.util.*;

public class Carrinho {
    
    private List<ItemCarrinho> itensCarrinho;
    
    public Carrinho(){
        itensCarrinho = new ArrayList();
    }
      
    public void addItem(ItemCarrinho item){
        itens.add(item);
    }
    
    public double calculaTotal(){
        double total = 0.0;
        for(ItemCarrinho item: itens){
            total += item.calculaSubtotal();
        }
        return total;
    }
    
    public void exibeCarrinho(){
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("%77s","CARRINHO\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("%7s","Produto");
        System.out.format("%44s", "Valor Unitário");
        System.out.format("%40s", "Quantidade");
        System.out.format("%36s", "Valor\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");

        for(ItemCarrinho i: itens){
            
            int tStringProd = i.getIngresso().getTipo().length();
            String strValorUnit = i.getIngresso().getValor()+ "";
            int tStringValorUnit = 37 - tStringProd + strValorUnit.length();
            
            String strQuant = i.getQtd() + "";
            //numCaracteresAnt = 
            int aux = 37 + strValorUnit.length();
            
            int tStringQuant = 81 - aux + strQuant.length();
            String strValor = i.calculaSubtotal() + "";
            
            aux = 81 + strQuant.length();
            int tStringValor = 122 - aux + strValor.length();
                            
            System.out.print(i.getIngresso().getTipo());
            System.out.format("%" + tStringValorUnit + "s", i.getIngresso().getValor());
            
            System.out.format("%" + tStringQuant + "s", i.getQtd());
            System.out.format("%" + tStringValor + "s", i.calculaSubtotal() + "\n");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Total: " + calculaTotal());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
    public float fecharCompra(){
        return 0.0f;
    }
    
}