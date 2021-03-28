package br.com.aplicativo.luan.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PAGAMENTO_CARTAO")
@Getter
@Setter
@JsonTypeName("pagamentoCartao")
public class PagamentoCartao extends Pagamento {

    private static final long serialVersionUID = 703112821872004745L;

    private Integer numeroParcelas;

}
