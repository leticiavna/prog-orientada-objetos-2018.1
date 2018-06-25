import java.util.List;

public class Ingresso{
    private Local local;
    private Evento evento;
    private TipoIngresso tipo;

    // construtor da classe Ingresso
    public Ingresso(){
    
    }

    // GETS para retornar o valor dos atributos (obedecendo o encapsulamento)
    public Local getLocalIngresso(){
        return local.getLocal();
    }

    public Evento getNomeEventoNoBilhete() {
        return evento.getNomeArtista();
    }

    public Evento getTurneNoBilhete(){
        return evento.getTurne();
    }

    public TipoIngresso getTipoIngressonoBilhete() {
        return tipo.getTipoIngresso();   
    }
    
    public TipoIngresso getValorIngressoNoBilhete() {
        return tipo.getValorIngresso();
    }
}