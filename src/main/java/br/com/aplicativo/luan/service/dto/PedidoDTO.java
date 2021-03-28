package br.com.aplicativo.luan.service.dto;

import br.com.aplicativo.luan.domain.ItemPedido;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
public class PedidoDTO implements Serializable {

    private Long id;

    private LocalDateTime instante;

    private Integer pagamento;

    private Integer usuario;

    private Integer enderecoEntrega;

    private Set<ItemPedido> itens;
}
