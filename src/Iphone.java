import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Musica musica = new Musica();
        Internet internet = new Internet();

        musica.tocar();
        musica.pausar();
        int sel = sc.nextInt();
        musica.selecionarMusica(sel);

        internet.exibirPagina();
        internet.AtualizarPagina();
        internet.AddNvAba();

        Telefone.Atender();
        Telefone.Ligar();
        Telefone.CorreioDeVoz();

    }
}