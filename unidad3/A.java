package Unidad3;
/**
 * TAREA 6
 * Clase que representa A.java
 * hereda los miembros de la clase Uno
 * @author bryanttrujillo
 * 
 */
public class A  extends Uno{
	protected String a = "A";
	
	public A(){
		System.out.println("clase A");
		
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
	public String toString() {
		return super.toString()+ " clase "+ a ;
	}
	

}