import java.util.Arrays;
import java.util.List;

public class Internet {
    int abasAbertas = 4;
    List<String> abas = Arrays.asList("pag1", "pag2", "pag3", "pag4");
    String abaAtual = abas.get(0);
    public void exibirPagina(){
        System.out.println(abaAtual);
    }
    public void AddNvAba(){
        System.out.println("Adicionando uma nv aba");
        abasAbertas++;
    }
    public void AtualizarPagina(){
        System.out.println("Atulizando...");
    }
}
