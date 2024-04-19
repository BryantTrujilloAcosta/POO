package Unidad3;
/**
 * tarea 2
 * Clase que representa ColorPunto.java
 * recibe como herencia a todos los miembros
 * de la clase D3Punto, tiene como atributo un String
 * llamado color con valor azul, metodo get y set 
 * y un String que retorna el String de la clase padre
 * y el atributo de la calse ColorPunto
 * @author bryanttrujillo
 * 5 abr. 2022 02:04:13
 *
 */
public class ColorPunto extends D3Punto {
	private String color = "azul";
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	public String toString() {
		return super.toString()+","+color;
	}

}
