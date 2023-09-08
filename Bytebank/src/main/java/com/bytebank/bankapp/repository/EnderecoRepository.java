package com.bytebank.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bytebank.bankapp.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>  {

}
