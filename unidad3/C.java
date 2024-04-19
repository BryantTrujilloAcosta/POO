package Unidad3;
/**
 * Tarea 6
 * Clase que representa C.java
 * hereda los miembros de la clase D.java
 * @author bryanttrujillo
 *
 */
public class C extends D{
	protected String c = "C"; 
	
	public C(){
		System.out.println("clase C");	
	}
	
	public String getC() {
		return c;
	}
	
	public void setC(String c) {
		this.c = c;
	}
	
	public String toString() {
		return super.toString()+" clase "+c;
	}
	

}
