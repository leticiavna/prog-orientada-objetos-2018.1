import java.util.*;

public class Loja{
    public static void main(String[] args) {
        Evento evento1 = new Evento("Letícia e Mari dos Teclados", "Born Again");
        evento1.criaLocalData(1995, 1, 1, "Arena Ceres no Cinturão de Asteróide");
        evento1.criaLocalData(2020, 9, 21, "Estádio de Alexandria");
        evento1.criaLocalData(2006, 6, 6, "Broadway de Nova Nova York");
        System.out.println(evento1.getNomeArtista());
        evento1.getLocais();
    }
}