package com.clearminds.interfaces;

import com.clearminds.model.Persona;

public interface ServicioPersona {
	
		public abstract boolean insertar(Persona persona);
		public abstract boolean actualizar(Persona persona);
		public abstract boolean eliminar(Persona persona);
		
	

}
