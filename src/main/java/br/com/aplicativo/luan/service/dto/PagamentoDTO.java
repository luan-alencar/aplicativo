package br.com.aplicativo.luan.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PagamentoDTO implements Serializable {

    private Long id;

    private Long estado;

    private Integer pedido;
}
