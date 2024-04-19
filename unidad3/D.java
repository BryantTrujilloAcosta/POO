package Unidad3;
/**
 * Tarea 6
 * Clase que representa D.java
 * hereda los miembros de la clase G.java
 * @author bryanttrujillo
 *
 */
public class D extends G{
	protected String d = "D";
	
	public D(){
		System.out.println("clase D");
		
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}
	public String toString() {
		return super.toString()+" clase "+d;
	}


}

