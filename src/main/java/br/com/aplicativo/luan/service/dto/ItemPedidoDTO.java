package br.com.aplicativo.luan.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ItemPedidoDTO implements Serializable {

    private Integer itemPedidoPK;

    private Double desconto;

    private Integer quantidade;

    private Double preco;
}
