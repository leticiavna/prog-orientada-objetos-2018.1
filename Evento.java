import java.util.*;

public class Evento {
	private String nomeArtista;
	private String turne;
	private List<String> datas;
	private List<String> cidades;

	public Evento(String nomeArtista, String turne){
		this.nomeArtista = nomeArtista;
		this.turne = turne;
	}
	

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void getCidadesLocal() {
		int tamanhoLista = this.cidades.size();
		for(int i = 0; i < tamanhoLista; i++){
			System.out.print("Local: ");
			System.out.print(this.cidades.get(i));
			System.out.print(" Data: ");
			System.out.print(this.cidades.get(i));
		}
	}

	public String getTurne() {
		return turne;
	}

	public void criaLocalData(String data, String local){
		this.datas.add(data);
		this.local.add(local);
	}

}
