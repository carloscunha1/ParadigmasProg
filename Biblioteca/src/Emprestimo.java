import java.time.LocalDateTime;

public class Emprestimo {
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucaoPrevista;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo(LocalDateTime dataEmprestimo, LocalDateTime dataDevolucaoPrevista, Leitor leitor, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.leitor = leitor;
        this.livro = livro;
    }

    public LocalDateTime getDataEmprestimo() { return dataEmprestimo; }
    public LocalDateTime getDataDevolucaoPrevista() { return dataDevolucaoPrevista; }
    public Leitor getLeitor() { return leitor; }
    public Livro getLivro() { return livro; }

    @Override
    public String toString() {
        return "Emprestimo: Leitor=" + leitor + ", Livro='" + livro.getTitulo() + "', DataEmprestimo=" + dataEmprestimo + ", DevolucaoPrevista=" + dataDevolucaoPrevista;
    }
}
