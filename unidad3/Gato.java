package Unidad3;
/**
 * tarea3
 * Clase que representa Gato.java
 * recibe como herencia todos los miembros 
 * de la clase Animal, tiene atributo nombre de tipo String
 * un constructor que recibe como parametro un String
 * llama al constructor de la clase padre Animal con el valor de gato
 * metodo get, metodo printSonido que imprime "miau"
 * metodo toString llamando el String de la clase padre y el
 * atributo nombre 
 * @author bryanttrujillo
 * 5 abr. 2022 02:14:48
 *
 */
public class Gato extends Animal {
	private String nombre;
	public Gato(String nombre) {
		super("Gato");
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void printSonido() {
		System.out.println("miau");
	}
	public String toString() {
		return super.toString()+" , me llamo "+nombre;
	}

}
