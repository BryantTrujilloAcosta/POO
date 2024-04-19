package Unidad3;
/**
 * Tarea 4 y tarea 5 
 * Clase que usa la clase Padre.java
 * y sus derivadas HijoB y HijoC
 * @author bryanttrujillo
 *
 */
public class UsaPadre {

	public static void main(String[] args) {
	  /* ejemplo de la tarea 4
	   Padre objeto1 = new Padre();
		System.out.println(objeto1);
		HijoB objeto2 = new HijoB();
		System.out.println(objeto2);
		HijoC objeto3 = new HijoC();
		System.out.println(objeto3);
       */
		//ejemplo de la tarea 5
		Padre objeto1 = new Padre(5);
		System.out.println(objeto1);
		HijoB objeto2 = new HijoB(4);
		System.out.println(objeto2);
		HijoC objeto3 = new HijoC(3);
		System.out.println(objeto3);
		
	}

}
