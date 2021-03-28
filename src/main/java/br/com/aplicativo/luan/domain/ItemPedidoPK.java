package br.com.aplicativo.luan.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@Embeddable // diz que a classe é um subtipo
public class ItemPedidoPK implements Serializable {

    private static final long serialVersionUID = -2609345854618585609L;

    /*
     * Classe auxiliar para representar o identificador do ItemPedido
     */

    @ManyToOne
    @JoinColumn(name = "PEDIDO_ID")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "PRODUTO_ID")
    private Produto produto;
}

