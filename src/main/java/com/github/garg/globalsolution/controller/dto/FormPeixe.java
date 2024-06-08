package com.github.garg.globalsolution.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.github.garg.globalsolution.model.Peixe;

public class FormPeixe {

	private Long id;
	private String nomePeixe;
	private String descricao;
	private BigDecimal pesoMaximo;
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
	
	public FormPeixe toForm(Peixe peixe) {
		this.id = peixe.getId();
		this.nomePeixe = peixe.getNomePeixe();
		this.descricao = peixe.getDescricao();
		this.pesoMaximo = peixe.getPesoMaximo();
		this.data = peixe.getData();
	
		return this;
	}

	public Peixe toModel() {
		Peixe peixe = new Peixe();
		peixe.setId(this.getId());
		peixe.setNomePeixe(this.getNomePeixe());
		peixe.setDescricao(this.getDescricao());
		peixe.setPesoMaximo(this.getPesoMaximo());
		peixe.setData(this.getData());
		return peixe;
	}
	
	
}
