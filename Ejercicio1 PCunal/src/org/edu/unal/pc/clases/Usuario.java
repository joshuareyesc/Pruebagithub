package org.edu.unal.pc.clases;

public class Usuario {
	public String nombre;
	public String telefono;
	public String email;

	

	public Usuario(String nom, String tele, String ema) {
		this.nombre= nom;
		this.telefono = tele;
		this.email = ema;
	}

	public String getNombre() {
	    return nombre;
	}
	public Usuario() {
		this("juan", "3464896", "juan@unal.edu.co");
	}

	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}

	public String getTelefono() {
	    return telefono;
	}

	public void setTelefono(String telefono) {
	    this.telefono = telefono;
	}

	public String getEmail() {
	    return email;
	}

	public void setEmail(String email) {
	    this.email = email;
	}

}
