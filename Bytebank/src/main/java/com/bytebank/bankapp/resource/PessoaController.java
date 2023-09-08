package com.bytebank.bankapp.resource;

import com.bytebank.bankapp.resource.dto.PessoaDto;
import com.bytebank.bankapp.service.PessoaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/pessoas")
@AllArgsConstructor
public class PessoaController {

  // GET, POST, PUT, DELETE
    private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<PessoaDto>> findAll() {

        List<PessoaDto> pessoas = pessoaService
                .getAll()
                .stream()
                .map(PessoaDto::new)
                .collect(Collectors.toList());

        if(pessoas.isEmpty())
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

        return ResponseEntity.ok(pessoas);
    }

}
