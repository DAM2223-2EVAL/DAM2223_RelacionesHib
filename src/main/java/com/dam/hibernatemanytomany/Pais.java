package com.dam.hibernatemanytomany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Pais {
	
	@Id
	private int codigo;
	@Column
	private String nombre;
	@Column
	private String continente;
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Presidente> listaPresidentes;
	

	public Pais(int codigo, String nombre, String continente) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.continente = continente;
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
	
	public List<Presidente> getListaPresidentes() {
		return listaPresidentes;
	}

	public void setListaPresidentes(List<Presidente> listaPresidentes) {
		this.listaPresidentes = listaPresidentes;
	}
	
	public void anhadirPresidente(Presidente p) {
		listaPresidentes.add(p);
	}
	
	public void borrarPresidente(Presidente p) {
		listaPresidentes.remove(p);
	}
	
	
}
