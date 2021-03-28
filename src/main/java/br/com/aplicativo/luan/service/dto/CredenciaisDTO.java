package br.com.aplicativo.luan.service.dto;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CredenciaisDTO implements Serializable {

    private String email;

    private String senha;
}
