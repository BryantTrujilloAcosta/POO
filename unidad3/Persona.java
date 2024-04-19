package Unidad3;
/**
 * tarea 7 y tarea 8
 * Clase que representa Persona.java
 * @author bryanttrujillo
 * 28 abr. 2022 02:23:39
 *
 */
public class Persona {
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected char sexo;
	public Persona(String nombre, String apellido, int edad, char sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
		return nombre +", "+ apellido + ", " + edad + ", " + sexo;
	}
	
	

}
