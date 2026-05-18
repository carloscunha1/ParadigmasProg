package dc.unifacef.clientes.service;

import dc.unifacef.clientes.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private final List<Cliente> clientes = new ArrayList<>();
    private long nextId = 1;

    public List<Cliente> listar() {
        return clientes;
    }

    public Cliente criar(Cliente c) {
        c.setId(nextId++);
        clientes.add(c);
        return c;
    }

    public Cliente buscarPorId(Long id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean remover(Long id) {
        return clientes.removeIf(c -> c.getId().equals(id));
    }

    public Cliente atualizar(Long id, Cliente novo) {
        novo.setId(id);
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(id)) {
                clientes.set(i, novo);
                return novo;
            }
        }
        return null;
    }
}
