package Unidad3;
/**
 * tarea 4 y tarea 5
 * Clase que representa HijoC.java
 * clase derivada de Padre.java 
 * clase derivada con constructor
 * @author bryanttrujillo
 */
public class HijoC extends Padre{
	int c=3;
	public HijoC(int valor) {
		super(valor);
		c=valor;
	}
	public void setC(int x) {
		c=x;
	}
	public int getC() {
		return c;
	}
	public String toString() {
		return super.toString()+", valor "+c;
	}

}
