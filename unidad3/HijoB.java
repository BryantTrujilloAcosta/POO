package Unidad3;
/**
 * tarea 4 y tarea 5
 * Clase que representa HijoB.java
 * clase derivada de Padre.java
 * sin constructor
 * @author bryanttrujillo
 */
public class HijoB  extends Padre{
	public HijoB(int a) {
		super(a);
	}
	int b=2;
	public void setB(int x) {
		b=x;
	}
	public int getB() {
	return b;
	}
	public String toString() {
		return super.toString()+", valor "+b;
	}

}
