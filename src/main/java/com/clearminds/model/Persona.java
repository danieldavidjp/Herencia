package com.clearminds.model;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String cedula;
	
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}
	public Persona(String nombre, String apellido, String cedula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}
	
	
	

}
