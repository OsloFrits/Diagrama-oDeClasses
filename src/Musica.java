import java.util.Arrays;
import java.util.List;

public class Musica {
    List<String> musicas = Arrays.asList("msuica1", "msuica2", "msuica3", "msuica4");
    String musicaSelecionada = musicas.get(0);
    public void tocar(){
        System.out.println("Tocando musica: " + musicaSelecionada);
    }public void pausar(){
        System.out.println("Pausando");
    }public void selecionarMusica(int selecao){
        System.out.println("escolha uma musica: ");
        for(String m : musicas){
            System.out.println(m);
        }
        musicaSelecionada = musicas.get(selecao-1);
    }
}
