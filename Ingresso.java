import java.util.List;

public class Ingresso{
    private Local local;
    private Evento evento;
    private TipoIngresso tipo;

    // construtor da classe Ingresso
    public Ingresso(){
    
    }

    // GETS para retornar o valor dos atributos (obedecendo o encapsulamento)
    public String getLocalIngresso(){
        return local.getNome();
    }

    public String getNomeEventoNoBilhete() {
        return evento.getNomeArtista();
    }

    public String getTurneNoBilhete(){
        return evento.getTurne();
    }

    public String getTipoIngressonoBilhete() {
        return tipo.getTipoIngresso();   
    }
    
    public double getValorIngressoNoBilhete() {
        return tipo.getValorIngresso();
    }
}