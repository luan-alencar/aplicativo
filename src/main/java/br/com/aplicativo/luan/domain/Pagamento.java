package br.com.aplicativo.luan.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_PAGAMENTO")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public abstract class Pagamento implements Serializable {

    private static final long serialVersionUID = 7523349464311888347L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PAGAMENTO")
    @SequenceGenerator(sequenceName = "SQ_PAGAMENTO", name = "SQ_PAGAMENTO", allocationSize = 1)
    private Long id;

    @Column(name = "ESTADO")
    private Long estado;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "PEDIDO_ID")
    @MapsId
    private Pedido pedido;
}
