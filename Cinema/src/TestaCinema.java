import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {
        Filme batman = new Filme(1, "Batman", "Ação", 130);
        Filme duna = new Filme(2, "Duna", "Ficção", 155);
        Sessao sessao = new Sessao(1, LocalDateTime.of(2026, 7, 20, 20, 0), 1);
        sessao.vincularFilme(batman);
        sessao.venderIngresso(1, "A1", "Inteira", 30.0f);
        sessao.venderIngresso(2, "A2", "Meia", 15.0f);
        sessao.venderIngresso(3, "A3", "Inteira", 30.0f);
        System.out.println(sessao);
    }
}
