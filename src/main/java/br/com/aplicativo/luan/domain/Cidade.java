package br.com.aplicativo.luan.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "TB_CIDADE")
@Getter
@Setter
public class Cidade implements Serializable {

    private static final long serialVersionUID = -6890855485949546802L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CIDADE")
    @SequenceGenerator(sequenceName = "SQ_CIDADE", name = "SQ_CIDADE", allocationSize = 1)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "ESTADO_ID") // definindo o nome da chave estrangeira no DB
    private Estado estado;
}
