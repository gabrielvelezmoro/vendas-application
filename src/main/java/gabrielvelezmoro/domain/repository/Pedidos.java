package gabrielvelezmoro.domain.repository;

import gabrielvelezmoro.domain.entity.Cliente;
import gabrielvelezmoro.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByCliente(Cliente cliente);
}
