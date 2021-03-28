package br.com.aplicativo.luan.service.dto;

import br.com.aplicativo.luan.domain.Cidade;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class EstadoDTO implements Serializable {

    private Long id;

    private String nome;

    private List<Cidade> cidades;

}
