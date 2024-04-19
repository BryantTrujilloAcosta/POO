package unidad4;
/**
 * Tarea 3
 * Clase que usa el metodo equals de la clase Persona
 * crea objetos de diferentes tipos y los compara
 * @author bryanttrujillo
 * 8 may. 2022 10:58:38
 *
 */
public class UsaPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona("Bryant","Trujillo");
		Persona p2 = new Persona("Bryant","Acosta");
		Persona p3 = new Persona("bryant","Trujillo");
		Alumno a1 = new Alumno("jose","Trujillo",20,'H',"12345");
		Point p4 = new Point(2,3);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(a1.equals(p1));
		System.out.println(p1.equals(p4));
		

	}

}
