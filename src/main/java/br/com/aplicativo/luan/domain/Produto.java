package br.com.aplicativo.luan.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TB_PRODUTO")
@Getter
@Setter
public class Produto implements Serializable {
    private static final long serialVersionUID = 7664297399029425755L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PRODUTO")
    @SequenceGenerator(sequenceName = "SQ_PRODUTO", name = "SQ_PRODUTO", allocationSize = 1)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "PRECO")
    private Double preco;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "PRODUTO_CATEGORIA", joinColumns = @JoinColumn(name = "PRODUTO_ID"), inverseJoinColumns = @JoinColumn(name = "CATEGORIA_ID"))
    private List<Categoria> categorias = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "ID.PRODUTO")
    private Set<ItemPedido> itens = new HashSet<>();

}