public class TipoIngresso {
    // assim, atrelamos o valor do ingresso ao tipo correspondente
    private double valor;
    private String tipo;

    // construtor do Tipo Ingresso
    public TipoIngresso(String tipo, double valor) {
        this.valor = valor;
        this.tipo = tipo;
    }

    // GETS para retornar o valor do atributos (obedecendo ao encapsulamento)
    public String getTipoIngresso() {
        return tipo;
    }

    public double getValorIngresso() {
        return valor;
    }

    
}