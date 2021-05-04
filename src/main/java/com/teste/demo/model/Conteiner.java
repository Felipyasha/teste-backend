package com.teste.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conteiner implements Serializable{	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false) 
	private long id;
	private String cliente;
	private String numeroConteiner;
	private String tipo;
	private String status;
	private String categoria;
	
	public Conteiner() {}
	
	public Conteiner(String cliente, String numeroConteiner, String tipo, String status, String categoria) {
		this.cliente = cliente;
		this.numeroConteiner = numeroConteiner;
		this.tipo = tipo;
		this.status = status;
		this.categoria = categoria;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getNumeroConteiner() {
		return numeroConteiner;
	}
	public void setNumeroConteiner(String numeroConteiner) {
		this.numeroConteiner = numeroConteiner;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
