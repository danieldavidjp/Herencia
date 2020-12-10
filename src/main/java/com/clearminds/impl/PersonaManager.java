package com.clearminds.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.exceptions.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {

	private ServicioPersona serv;
	
	private String leerPropiedad(String propiedad) {
		Properties p = new Properties();
		String propiedadFinal;

		try {
			p.load(new FileReader("config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Archivo no encontrado");
		}

		if (p.getProperty(propiedad) != null) {

			propiedadFinal = p.getProperty(propiedad);

		} else {

			propiedadFinal = null;
		}

		return propiedadFinal;

	}

	public PersonaManager() throws InstanceException {
		String propiedad= leerPropiedad("propiedad1");
		
		Class<?> clase;
		try {
			clase = Class.forName(propiedad);
			System.out.println("Propiedad: "+propiedad);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");

		}
		try {
			serv = (ServicioPersona) clase.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}

	public ServicioPersona getServ() {
		return serv;
	}

	public void setServ(ServicioPersona serv) {
		this.serv = serv;
	}

}
