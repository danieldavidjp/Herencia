package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {

	private ServicioPersona serv;

	public PersonaManager() {
		
		serv = new ServicioPersonaBDD();
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
