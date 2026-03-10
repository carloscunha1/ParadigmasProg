import java.util.Date;

// classe todo
public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
