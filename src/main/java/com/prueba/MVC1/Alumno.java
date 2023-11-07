package com.prueba.MVC1;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.*;


public class Alumno {
	@NotEmpty(message = "El email no puede estar vacio")
	@Email(message="No es un email valido")
	private String email;
	@Size(min=2, message="Debe ingresar un nombre valido")
	@NotEmpty(message = "El nombre no puede estar vacio")
	private String nombre;
	private String apellido;
	private String materiaOptativa;
	private String sede;
	private String idioma;
	@Min(value=10, message="No se permiten edades menores de 10")
	@Max(value=21, message="No se permiten edades mayores de 21")
	private int edad;
	@Pattern(regexp="[0-9]{5}", message="Ingrese 5 valores numericos")
	private String codPostal;


	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
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
	
	public String getMateriaOptativa() {
		return materiaOptativa;
	}
	public void setMateriaOptativa(String materiaOptativa) {
		this.materiaOptativa = materiaOptativa;
	}
	
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
}
