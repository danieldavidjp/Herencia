package com.clearminds.tests;

import com.clearminds.exceptions.InstanceException;
import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		
		Persona p = new Persona("Daniel","Jimenez","123456");
		
		PersonaManager pm;
		try {
			pm = new PersonaManager();
			pm.insertarPersona(p);
		} catch (InstanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
