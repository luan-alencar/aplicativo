package br.com.aplicativo.luan.service.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Getter
@Setter
public class UsuarioDTO implements Serializable {

    private Long id;

    @NotEmpty(message = "Preechimento obrigatório!")
    @Length(min = 5, max = 120, message = "O tamanho deve ser entre 5 a 120 caracteres")
    private String nome;

    @NotEmpty(message = "Preechimento obrigatório!")
    @Email(message = "Email inválido")
    private String email;
}
