package com.bytebank.bankapp.resource.dto;

import com.bytebank.bankapp.domain.Pessoa;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PessoaDto {

    private String nomePreferencial;

    public PessoaDto(Pessoa pessoa) {
        this.nomePreferencial = (pessoa.getApelido().equals("") ) ?
                pessoa.getNomeCompleto() : pessoa.getApelido();
    }

}
