package com.bytebank.bankapp.domain;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "contas")
@Getter @Setter @NoArgsConstructor
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private BigDecimal saldo;
}
