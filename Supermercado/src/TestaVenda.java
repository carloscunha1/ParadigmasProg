public class TestaVenda {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "João");
        Produto p1 = new Produto(1, "Arroz", 5.0);
        Produto p2 = new Produto(2, "Feijão", 7.0);
        Venda venda = new Venda(cliente);
        venda.adicionarItem(1, 2, p1);
        venda.adicionarItem(2, 1, p2);
        System.out.println(venda);
    }
}
