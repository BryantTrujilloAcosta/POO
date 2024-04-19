package Unidad3;
/**
 * Tarea 6
 * Clase que representa Uno.java
 * @author bryanttrujillo
 *
 */
public class Uno {
	protected String nombre="clase base";
	
	public Uno(){
		System.out.println("clase uno");
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String toString() {
		return nombre;
	}

}
