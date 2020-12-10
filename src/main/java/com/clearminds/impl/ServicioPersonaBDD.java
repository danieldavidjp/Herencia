package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaBDD implements ServicioPersona {

	public boolean insertar(Persona persona) {
		System.out.println("Insertando Persona: " + persona.toString());
		return true;
	}

	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando Persona: " + persona.toString());
		// TODO Auto-generated method stub
		return true;
	}

	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando Persona: " + persona.toString());
		// TODO Auto-generated method stub
		return true;
	}

}
