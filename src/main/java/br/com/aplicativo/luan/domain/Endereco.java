package br.com.aplicativo.luan.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_ENDERECO")
@Getter
@Setter
public class Endereco implements Serializable {

    private static final long serialVersionUID = -6535328073890416782L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ENDERECO")
    @SequenceGenerator(sequenceName = "SQ_ENDERECO", name = "SQ_ENDERECO", allocationSize = 1)
    private Long id;

    @Column(name = "LOGRADOURO")
    private String logradouro;

    @Column(name = "NUMERO")
    private String numero;

    @Column(name = "COMPLEMENTO")
    private String complemento;

    @Column(name = "BAIRRO")
    private String bairro;

    @Column(name = "CEP")
    private String cep;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "USUARIO_ID")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "CIDADE_ID")
    private Cidade cidade;
}
