import java.util.ArrayList;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public void construirApartamento(int num, int andar) {
        apartamentos.add(new Apartamento(num, andar));
    }

    public ArrayList<Apartamento> getApartamentos() {
        return apartamentos;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", apartamentos=" + apartamentos +
                '}';
    }
}
