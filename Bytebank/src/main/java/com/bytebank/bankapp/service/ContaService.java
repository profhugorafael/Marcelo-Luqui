package com.bytebank.bankapp.service;

import org.springframework.stereotype.Service;

import com.bytebank.bankapp.repository.ContaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ContaService {

	private ContaRepository contaRepository;
	
	
}
