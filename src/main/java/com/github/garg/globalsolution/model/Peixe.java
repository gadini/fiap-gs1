package com.github.garg.globalsolution.model;

import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "peixes")
public class Peixe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="NOMEPEIXE", nullable = false, length = 50)
	private String nomePeixe;
	
	@Column(name="DESCRICAO", nullable = false, length = 350)
	private String descricao;
	
	@Column(name="PESOMAXIMO", nullable = true, columnDefinition = "NUMERIC(15,2)")
	private BigDecimal pesoMaximo;
	
	@Column(name="DATA", nullable = true, columnDefinition = "DATE")
	private LocalDate data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomePeixe() {
		return nomePeixe;
	}

	public void setNomePeixe(String nomePeixe) {
		this.nomePeixe = nomePeixe;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(BigDecimal pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
}
