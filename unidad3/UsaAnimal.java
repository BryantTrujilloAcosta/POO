package Unidad3;
/**
 * tarea 3
 * Clase que usa la clase Animal.java y sus clases 
 * derivadas perro, vaca, pato,gato 
 * @author bryanttrujillo
 *
 */
public class UsaAnimal {

	public static void main(String[] args) {
		Animal animal1=new Animal(" Leon");
		Object animal2= new Animal(" perro");
		Perro perro1 = new Perro(" Scoby");
		Pato pato1 = new Pato(" donald");
		Gato gato1 = new Gato(" garfield");
		Vaca vaca1 = new Vaca(" otis");
		System.out.println(animal1);
		animal1.printMensaje();
		System.out.println(animal2);
		System.out.println(perro1);
		perro1.printSonido();
		System.out.println(pato1);
		pato1.printMensaje();
		System.out.println(gato1);
		gato1.printMensaje();
		gato1.printSonido();
		System.out.println(vaca1);
		vaca1.printSonido();
		vaca1.printMensaje();
		
		

	}

}
