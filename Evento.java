import java.util.*;

public class Evento {
	private String nomeArtista;
	private String turne;
	private List<String> datas;
	private List<String> cidades;

	public Evento(String nomeArtista, String turne, List<String> datas, List<String> cidades){
		this.nomeArtista = nomeArtista;
		this.turne = turne;
		this.datas = datas;
		this.cidades = cidades;
	}
	

	public String getNomeArtista() {
		return nomeArtista;
	}

	public List<String> getCidades() {
		return cidades;
	}

	public List<String> getDatas() {
		return datas;
	}

	public String getTurne() {
		return turne;
	}

}
