package Unidad3;
/**
 * tarea 2
 * Clase que representa D3Punto.java
 * tiene como atributos x,y,z de tipo int con valor de 0
 * y un atributo static tipo int llamado totalPuntos con valor de 0
 * tiene 2 constructores uno que no recibe parametros y otro
 * que recibe 3 parametros de tipo entero, metodos get y set para 
 * cada atributo, metodo llamado medio que recibe como parametro
 * un objeto de tipo D3Punto y retorna un nuevo punto con medio
 * al final un metodo toString 
 * @author bryanttrujillo
 * 5 abr. 2022 02:04:34
 *
 */
public class D3Punto {
	protected int x=0;
	protected int y=0;
	protected int z=0;
	public static int totalPuntos=0;
	// a constructor
	public D3Punto() {
		totalPuntos++;
	}
	public D3Punto(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		totalPuntos++;
	}
	public void setX(int _x) {
		x=_x;
		
	}
	public void setY(int _y) {
		y=_y;
	}
	public void setZ(int _z) {
		z=_z;
	}
	public int getY() {
		return y;
	}
	public int getX() {
		return x;
	}
	public int getZ() {
		return z;
	}
	public D3Punto medio(D3Punto p) {
		return new D3Punto((p.x+x)/2, (p.y+y)/2, (p.z+z)/2);
	}
	public String toString() {
		return "("+x+","+y+","+z+")";
	}

}

