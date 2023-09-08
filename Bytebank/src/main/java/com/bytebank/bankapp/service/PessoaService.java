package com.bytebank.bankapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bytebank.bankapp.domain.Pessoa;
import com.bytebank.bankapp.repository.PessoaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PessoaService {

	private PessoaRepository pessoaRepository;
	
	public List<Pessoa> getAll() {
		return pessoaRepository.findAll();
	}
	
	public Pessoa register(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

}
