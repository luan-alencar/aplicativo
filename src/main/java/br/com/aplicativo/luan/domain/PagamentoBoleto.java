package br.com.aplicativo.luan.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "TB_PAGAMENTO_BOLETO")
@Getter
@Setter
@JsonTypeName("pagamentoBoleto")
public class PagamentoBoleto extends Pagamento {

    private static final long serialVersionUID = 3543571303096502686L;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataVencimento;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime dataPagamento;
}
