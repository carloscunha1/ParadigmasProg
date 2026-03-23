import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme;
    private ArrayList<Ingresso> ingressos;

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco) {
        ingressos.add(new Ingresso(id, assento, tipo, preco));
    }

    public Filme getFilme() { return filme; }
    public ArrayList<Ingresso> getIngressos() { return ingressos; }

    @Override
    public String toString() {
        return "Sessao{" +
                "id=" + id +
                ", horario=" + horario +
                ", sala=" + sala +
                ", filme=" + filme +
                ", ingressos=" + ingressos +
                '}';
    }
}
