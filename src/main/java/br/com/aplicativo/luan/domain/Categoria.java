package br.com.aplicativo.luan.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TB_CATEGORA")
@Getter
@Setter
public class Categoria implements Serializable {

    private static final long serialVersionUID = -5923862061791782003L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CATEGORIA")
    @SequenceGenerator(sequenceName = "SQ_CATEGORIA", name = "SQ_CATEGORIA", allocationSize = 1)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "CATEGORIAS")
    @ManyToMany(mappedBy = "CATEGORIAS")
    private List<Produto> produtos;
}
