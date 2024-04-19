package unidad4;
/**
 * Tarea2 
 * Clase que usa la clase Point
 * @author bryanttrujillo
 * 8 may. 2022 10:03:56
 *
 */
public class UsaPoint {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p3 = new Point(1,3);
		Persona p2 = new Persona("juan");
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p2));

	}

}
