package com.bytebank.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bytebank.bankapp.domain.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

}
