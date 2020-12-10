package com.clearminds.tests;

import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		
		Persona p = new Persona("Daniel","Jimenez","123456");
		
		PersonaManager pm = new PersonaManager();
		
		pm.insertarPersona(p);
		
	}

}
