package Unidad3;
/**
 * Tarea 6 
 * Clase que representa G.java
 * hereda los miembros de la clase Uno.java
 * @author bryanttrujillo
 */
public class G extends Uno {
	protected String g = "G";
	
	public G(){
		System.out.println("clase G");
		
	}

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

	public String toString() {
		return super.toString()+" clase "+g;
	}
}
     