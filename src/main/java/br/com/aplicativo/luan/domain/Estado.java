package br.com.aplicativo.luan.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TB_ESTADO")
@Getter
@Setter
public class Estado implements Serializable {

    private static final long serialVersionUID = 3102955618630107784L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ESTADO")
    @SequenceGenerator(sequenceName = "SQ_ESTADO", name = "SQ_ESTADO", allocationSize = 1)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @JsonIgnore
    @OneToMany(mappedBy = "ESTADO")
    private List<Cidade> cidades;
}
