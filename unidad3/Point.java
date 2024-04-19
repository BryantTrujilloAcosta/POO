package Unidad3;
/**
 * Tarea 2
 * Clase que representa Point.java
 * contiene de atributos de tipo entero 
 * dos puntos llamados x, y y un atributo static tipo entero 
 * que representa el total de puntos
 * tiene dos contructores uno que no recibe parametros y otro
 * que recibe 2 parametros de tipo int 
 * tiene metodos get y set para cada atributo , un metodo medio
 * que recibe como parametros un objeto tipo Point y retorna un 
 * punto medio, y al final un metodo toString 
 * @author bryanttrujillo
 * 5 abr. 2022 01:35:55
 *
 */
public class Point {
	protected int x=0;
	protected int y=0;
	public static int totalPuntos=0;
	// a constructor
	public Point() {
		totalPuntos++;
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		totalPuntos++;
	}
	public void setX(int _x) {
		x=_x;
		
	}
	public void setY(int _y) {
		y=_y;
	}
	public int getY() {
		return y;
	}
	public int getX() {
		return x;
	}
	public Point medio(Point p) {
		return new Point((p.x+x)/2, (p.y+y)/2);
	}
	public String toString() {
		return "("+x+","+y+")";
	}

}
