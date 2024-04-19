package Unidad3;
/**
 * Tarea 2 
 * Clase que representa ColorPoint.java
 * que recibe como herencia a 
 * todos los miembros de la clase Point
 * tiene como atributo un String que tiene como valor
 * rojo y metodo get, set y toString
 * @author bryanttrujillo
 * 5 abr. 2022 01:43:06
 *
 */
public class ColorPoint extends Point{
	private String color = "rojo";
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	public String toString() {
		return super.toString()+"."+color;
	}

}
