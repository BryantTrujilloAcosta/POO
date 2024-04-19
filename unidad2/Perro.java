package unidad2;
/**
 * TAREA 4
 * Clase que representa
 * declaracion de la clase perro que tiene 
 * como atributos nombre, sexo, raza, edad, color, peso
 * con constructor con 3 parametros nombre, sexo,raza
 * @author bryanttrujillo
 * 19 feb. 2022 23:16:33
 *  
 */
public class Perro {
	//atributos
	private String nombre;
	private char sexo;
	private String raza;
	private int edad;
	private String color;
	private float peso;
	//constructor
	public Perro(String nombre, char sexo, String raza) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.raza = raza;
	}
	@Override
	public String toString() {
		return nombre+"\t"+sexo+"\t"+raza+"\t"+edad+" años"+
	                    "\t"+color+"\t"+peso+"kg";
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public String getRaza() {
		return raza;
	}
	public double edadPerroPersona() {
		
			return (int)(16*Math.log(edad))+31;
		}
	}
	
