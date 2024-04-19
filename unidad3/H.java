package Unidad3;
/**
 * Tarea 6
 * Clase que representa H.java
 * hereda los miembros de la clase G.java
 * @author bryanttrujillo
 *
 */
public class H  extends G{
	protected String h = "H";
	
	public H(){
		System.out.println("clase H");
		
	}

	public String getH() {
		return h;
	}

	public void setH(String h) {
		this.h = h;
	}
	
	public String toString() {
		return super.toString()+" clase "+h;
	}
	

}

