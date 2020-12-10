package com.clearminds.impl;

import com.clearminds.exceptions.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {

	private ServicioPersona serv;
	


	public PersonaManager() throws InstanceException {
		
		Class<?> clase;
		try {
			clase = Class.forName("com.clearminds.impl.ServicioPersonaBDD");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
					
		}
		try {
			serv = (ServicioPersona)clase.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}

	public ServicioPersona getServ() {
		return serv;
	}

	public void setServ(ServicioPersona serv) {
		this.serv = serv;
	}

}
