package com.dam.hibernateonetomany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Presidente {
	
	@Id
	private int id;
	@Column
	private String nombre;
	@Column
	private double sueldo;

/*
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDPais", foreignKey = @ForeignKey(name = "fk_pais"))
	private Pais pais;
*/
		
	public Presidente(int id, String nombre, double sueldo) {
		this.id = id;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
