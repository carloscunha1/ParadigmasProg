import java.time.LocalDateTime;

public class TestaBiblioteca {
    public static void main(String[] args) {
        Leitor leitor = new Leitor(1, "Carlos Souza");
        Livro livro = new Livro(1, "O Senhor dos Anéis", "J.R.R. Tolkien");
        Emprestimo emprestimo = new Emprestimo(
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(7),
                leitor,
                livro
        );
        System.out.println(emprestimo);
    }
}
