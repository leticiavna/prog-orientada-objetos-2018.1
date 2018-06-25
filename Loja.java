import java.util.*;

public class Loja{
    public static void main(String[] args) {
        String data1 =  "01/01/95";
        String data2 = "21/09/20";
        String data3 = "06/06/06";
        List<String> datas = new ArrayList<>();
        datas.add(data1);
        datas.add(data2);
        datas.add(data3);

        String cidade1 = "Ceres no Cinturão de Aste";
        String cidade2 = "Alexandria";
        String cidade3 = "Nova Nova York";
        List<String> cidades = new ArrayList<>();
        cidades.add(cidade1);
        cidades.add(cidade2);
        cidades.add(cidade3);

        Evento evento1 = new Evento("Letícia e Mari dos Teclados", "Born Again", datas, cidades);
        System.out.println(evento1.getNomeArtista());
    }
}