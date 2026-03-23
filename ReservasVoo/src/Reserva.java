import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private int codigo;
    private LocalDateTime data;
    private int assento;
    private Passageiro passageiro;

    public Reserva() {
    }

    public Reserva(int codigo, LocalDateTime data, int assento, Passageiro passageiro, Voo voo) {
        this.codigo = codigo;
        this.data = data;
        this.assento = assento;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    private Voo voo;

    @Override
    public String toString() {
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");
        return "Reserva{" +
                "codigo=" + codigo +
                ", data=" + data.format(formatoBr) +
                ", assento=" + assento +
                ", passageiro=" + passageiro +
                ", voo=" + voo +
                '}';
    }
}
