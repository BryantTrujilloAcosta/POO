package unidad4;
/**
 * Tarea 6
 * Clase que usa ClaseA, ClaseB y InterfazA
 * @author bryanttrujillo
 * 15 may. 2022 20:38:29
 *
 */
public class Tarea6 {

	public static void main(String[] args) {
		/*ClaseB instancia = new ClaseA();
		instancia.metodo1();
		
		InterfazA instancia = new ClaseB();
		instancia.metodo1();
		*/
		
		ClaseB  instancia = new ClaseB();
		System.out.println(instancia.metodo1());
		
		ClaseA instancia2 = new ClaseB();
		System.out.println(instancia.metodo1());
		/*
		InterfazA instancia3 = new ClaseB();
		instancia.metodo1();
		*/
		ClaseA instancia4 = new ClaseB();
		System.out.println(instancia.metodo3());
		

	}

}
