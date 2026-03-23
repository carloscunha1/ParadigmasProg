import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(int id, int quantidade, Produto produto) {
        itens.add(new ItemVenda(id, quantidade, produto));
    }

    public Cliente getCliente() { return cliente; }
    public ArrayList<ItemVenda> getItens() { return itens; }

    @Override
    public String toString() {
        return "Venda{" +
                "cliente=" + cliente +
                ", itens=" + itens +
                '}';
    }
}
