package unidad4;
/**
 * Tarea4
 * Clase para comparar objetos del metodo equals de la clase ColorPoint
 * @author bryanttrujillo
 * 8 may. 2022 11:10:38
 *
 */
public class UsaColorPoint {

	public static void main(String[] args) {
		Point p0 = new Point();
		Point p1 = new Point(1,3); 
		Persona p = new Persona("Maria"); 
		ColorPoint cp = new ColorPoint(); 
		ColorPoint cp2 = new ColorPoint();
		
		System.out.println(p1.equals(p));
		System.out.println(p0.equals(p1));
		System.out.println(p0.equals(cp));
		System.out.println(cp.equals(p0));
		System.out.println(cp.equals(cp2));
        
	}

}
