package br.com.aplicativo.luan.service.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Getter
@Setter
public class CategoriaDTO implements Serializable {

    private Long id;

    @NotEmpty(message = "Preenchimento obrigatório!")
    @Length(min = 5, max = 80, message = "O tamanho deve conter entre 5 a 80 caracteres!")
    private String nome;
}
