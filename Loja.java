import java.util.*;

public class Loja{
    public static void main(String[] args) {
        String data1 =  "01/01/95";
        String data2 = "21/09/20";
        String data3 = "06/06/06";

        String cidade1 = "Ceres no Cinturão de Aste";
        String cidade2 = "Alexandria";
        String cidade3 = "Nova Nova York";

        Evento evento1 = new Evento("Letícia e Mari dos Teclados", "Born Again")
        evento1.criaLocalData(data1, cidade1);
        evento1.criaLocalData(data2, cidade2);
        evento1.criaLocalData(data3, cidade3);
        System.out.println(evento1.getNomeArtista());
        evento1.getCidades();
    }
}