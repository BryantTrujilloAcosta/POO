package Unidad3;
/**
 * tarea 3
 * Clase que representa
 * Clase que representa Pato.java
 * recibe como herencia todos los miembros 
 * de la clase Animal, tiene atributo nombre de tipo String
 * un constructor que recibe como parametro un String
 * llama al constructor de la clase padre Animal con el valor de gato
 * metodo get, metodo printSonido que imprime "cuack"
 * metodo toString llamando el String de la clase padre y el
 * atributo nombre 
 * @author bryanttrujillo
 * 
 *
 */
public class Pato extends Animal {
	private String nombre;
	public Pato(String nombre) {
		super("Pato");
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void printSonido() {
		System.out.println("cuack");
	}
	public String toString() {
		return super.toString()+" , me llamo "+nombre;
	}

}
