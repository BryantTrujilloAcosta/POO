package Unidad3;
/**
 * Tarea 6
 * Clase que representa X.java
 * hereda los miembros de la clase D.java
 * @author bryanttrujillo
 *
 */
public class X extends D {
	protected String x = "X";
	
	public X(){
		System.out.println("clase X");
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}
	
	public String toString() {
		return super.toString()+" clase "+x;
	}
	
	

}

