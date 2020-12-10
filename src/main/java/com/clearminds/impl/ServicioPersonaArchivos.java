package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaArchivos implements ServicioPersona {

	public boolean insertar(Persona persona) {
		System.out.println("Insertando persona en archivo: " + persona.toString());
		return true;
	}

	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando persona en archivo: " + persona.toString());
		return true;
	}

	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando persona en archivo: " + persona.toString());
		return true;
	}

}
