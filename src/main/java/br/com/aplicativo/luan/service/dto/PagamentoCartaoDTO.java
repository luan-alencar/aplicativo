package br.com.aplicativo.luan.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PagamentoCartaoDTO implements Serializable {

    private Integer numeroParcelas;

}
