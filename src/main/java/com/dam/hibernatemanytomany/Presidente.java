package com.dam.hibernatemanytomany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Presidente {
	
	@Id
	private int id;
	@Column
	private String nombre;
	@Column
	private double sueldo;
	@ManyToMany(mappedBy = "listaPresidentes")
	private List<Pais> listaPais;

		
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
