package br.com.aplicativo.luan.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;


@Entity
@Table(name = "TB_PEDIDO")
@Getter
@Setter
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1023103959140314436L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PEDIDO")
    @SequenceGenerator(sequenceName = "SQ_PEDIDO", name = "SQ_PEDIDO", allocationSize = 1)
    private Long id;

    @Column(name = "INSTANTE")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime instante;

    @Column(name = "PAGAMENTO")
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "PEDIDO")
    private Pagamento pagamento;

    @ManyToOne
    @JoinColumn(name = "USUARIO_ID")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ENDERECO_ENTREGA_ID")
    private Endereco enderecoEntrega;

    // Set ajuda para garantir que não haverá produto repetido
    @OneToMany(mappedBy = "ID.PEDIDO")
    private Set<ItemPedido> itens;
}
