/**
 * 
 */
package unidad2;

/**
 * Clase que representa
 * Punto tiene atributos x,y,
 * y Total puntos que se usa 
 * para contar los puntos creados
 * @author bryanttrujillo
 * 26 feb. 2022 04:18:17
 *
 */
public class Punto {
	private int x=0;
	private int y=0;
	private static int totalPuntos=0;
Punto(int _x, int _y) {
		x = _x;
		y = _y;
		totalPuntos++;
	}
	public void setX(int _x) {
		x = _x;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	public static int getTotalPuntos() {

		return totalPuntos;
	}
	
	
}
