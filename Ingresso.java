import java.util.ArrayList;
import java.util.List;

public class Ingresso{
    private Local local;
    private Evento evento;
    private TipoIngresso tipos = new ArrayList<>();

    // construtor da classe Ingresso
    public Ingresso(TipoIngresso tipo1, TipoIngresso tipo2, TipoIngresso tipo3){
        this.tipos.add(tipo1);
		this.tipos.add(tipo2);
        this.tipos.add(tipo3);
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
        return tipos.getTipoIngresso();   
    }
    
    public double getValorIngressoNoBilhete() {
        return tipos.getValorIngresso();
    }
}