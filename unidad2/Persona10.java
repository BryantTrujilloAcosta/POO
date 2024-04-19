package unidad2;
/*
 * autor: Bryant Trujillo Acosta 
 * fecha:18 de febrero de 2022
 * proposito: declaracion de clase persona10.java
 * contiene atributos:nombre, sexo, edad
 * metodos: set y get para los atributos y toString
 * 
 */
public class Persona10 {
	//atributos
	private String nombre;
	private char sexo;
	private int edad;
	//constructor
	public Persona10(String nombre, char sexo, int edad) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return nombre+"\t"+sexo+"\t"+edad;
	}
//Obtiene el nombre de la persona
	public String getNombre() {
		return this.nombre;
	}
//Cambia el nombre de la persona
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
//Obtiene el sexo de la persona
	public char getSexo() {
		return this.sexo;
	}
//Obtiene la edad de la persona
	public int getEdad() {
		return this.edad;
	}
//Cambia la edad de la persona
	public void setEdad(int edad) {
		this.edad = edad;
	}
		
	

}
