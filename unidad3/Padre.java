package Unidad3;
/**
 * tarea 4 y tarea 5 
 * Clase que representa Padre.java
 * clase base sin constructor
 * @author bryanttrujillo
 */
public class Padre {
	int a =0;
	public Padre(int a) {
       this.a = a;
	}
	public void setA(int x) {
		a=x;
	}
	public int getA() {
		return a;
	}
	public String toString() {
		return "valor"+a;
	}

}
