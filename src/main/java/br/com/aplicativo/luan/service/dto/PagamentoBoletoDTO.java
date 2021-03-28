package br.com.aplicativo.luan.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class PagamentoBoletoDTO implements Serializable {

    private Date dataVencimento;

    private LocalDateTime dataPagamento;
}
