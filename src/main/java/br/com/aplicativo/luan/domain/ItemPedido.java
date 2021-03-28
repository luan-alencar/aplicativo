package br.com.aplicativo.luan.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_ITEM_PEDIDO")
@Getter
@Setter
public class ItemPedido implements Serializable {

    private static final long serialVersionUID = -7056179096974995728L;

    /*
     * Como é uma classe de associação ela não terá um id própio quem identifica ela
     * são os dois obj associados a ela: - pedidos - itens
     */
    // id com atributo composto
    @EmbeddedId
    private ItemPedidoPK itemPedidoPK;

    @Column(name = "DESCONTO")
    private Double desconto;

    @Column(name = "QUANTIDADE")
    private Integer quantidade;

    @Column(name = "PRECO")
    private Double preco;
}
