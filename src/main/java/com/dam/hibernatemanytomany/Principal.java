package com.dam.hibernatemanytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Principal {

	public static void main(String[] args) {
		
		StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();

		Session sesion = sf.openSession();
		
		sesion.beginTransaction();
		
		//Países
		Pais pais1 = new Pais(100, "Andorra", "Europa");
		Pais pais2 = new Pais(200, "Narnia", "Atlántida");
		
		//Presidente
		Presidente presidente1 = new Presidente(10, "Menganito", 90000);
		Presidente presidente2 = new Presidente(20, "Zutanito", 150000);
		Presidente presidente3 = new Presidente(30, "Fulanito", 100000);
		Presidente presidente4 = new Presidente(40, "Pepito", 1000);
		
		List<Presidente> lista1 = new ArrayList<Presidente>();
		lista1.add(presidente1);
		lista1.add(presidente2);
		lista1.add(presidente4);
		
		List<Presidente> lista2 = new ArrayList<Presidente>();
		lista2.add(presidente3);
		
		pais1.setListaPresidentes(lista1);
		pais2.setListaPresidentes(lista2);
		
		
		sesion.persist(presidente1);
		sesion.persist(presidente2);
		sesion.persist(presidente3);
		sesion.persist(presidente4);
		sesion.persist(pais1);
		sesion.persist(pais2);
		
		
		
		sesion.getTransaction().commit();
		
		
		sesion.close();
		sf.close();
		
	}

}
