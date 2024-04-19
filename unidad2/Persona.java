package unidad2;
/*
 * AUTOR: Bryant Trujillo Acosta
 * FECHA: 16 de febrero del 2022
 * Declaracion de clase Persona.java contiene
 * atributos nombre,sexo y edad 
 * metodos: get/set para los atributos y toString
 */
public class Persona {
  //atributos
	private String nombre;
	private char sexo;
	private int edad;
	private double altura;
	private double peso;


  //constructor con los 3 parametros para los atributos
	public Persona(String nombre, char sexo, int edad, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	@Override
	public String toString() {
		return nombre+"\t"+sexo+"\t"+edad+"\t"+altura+"\t"+peso+"m";
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
 // INDICE DE MASA CORPORAL 
	public double imc( ) {
		return peso/Math.pow(altura, 2) ;
		
	}

}
