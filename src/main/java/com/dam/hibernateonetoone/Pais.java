package com.dam.hibernateonetoone;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Pais {
	
	@Id
	private int codigo;
	@Column
	private String nombre;
	@Column
	private String continente;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DAMPresidente", foreignKey = @ForeignKey(name = "fk_presidente"))
	private Presidente idPresidente;
	

	public Pais(int codigo, String nombre, String continente, Presidente idPresidente) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.continente = continente;
		this.idPresidente = idPresidente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}
	
	public Presidente getIdPresidente() {
		return idPresidente;
	}

	public void setIdPresidente(Presidente idPresidente) {
		this.idPresidente = idPresidente;
	}
	
}
