package br.com.aplicativo.luan.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CidadeDTO implements Serializable {

    private Long id;

    private String nome;

    private Integer estado;
}
