// Criamos essa classe Data para facilitar o código.
public class Data{

    private int dia;
    private int mes;
    private int ano;
    
    // Construtor da classe Data
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // GETS para data
    public String getData(){
        return (this.dia + "/" + this.mes + "/" + this.ano);
    }

    // Formata a saída da data
    public void mostraData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}