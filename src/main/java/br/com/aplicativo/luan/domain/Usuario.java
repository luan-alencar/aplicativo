package br.com.aplicativo.luan.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TB_USUARIO")
@Getter
@Setter
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1084974786013537281L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USUARIO")
    @SequenceGenerator(sequenceName = "SQ_USUARIO", name = "SQ_USUARIO", allocationSize = 1)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "EMAIL", unique = true)
    private String email;

    @Column(name = "CPF_CNPK")
    private String cpfCnpj;

    @Column(name = "TIPO")
    private Long tipo;

    @JsonIgnore
    private String senha;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "PERFIS")
    private Set<Long> perfis = new HashSet<Long>();

    @JsonIgnore
    @OneToMany(mappedBy = "CLIENTE")
    private List<Pedido> pedidos;

    @OneToMany(mappedBy = "CLIENTE", cascade = CascadeType.ALL) // se eu apagar um Cliente todos seus Endereços tb serão
    private List<Endereco> enderecos;

    @ElementCollection
    @CollectionTable(name = "TELEFONES")
    private Set<String> telefones;
}
