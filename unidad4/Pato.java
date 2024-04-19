package unidad4;
/**
 * 
 * Clase Pato que usa la interface Animal
 * @author bryanttrujillo
 * 15 may. 2022 21:25:12
 *
 */
public class Pato extends Animales implements Animal{
	private String nombre;
	public Pato(String nombre) {
		super("Pato");
		this.nombre=nombre;
	}
	public void locomotion() {
		System.out.println("estoy nadando");
	}
	public void eat() {
		System.out.println("Como semillas");
	}
	public String toString() {
		return super.toString()+" , me llamo "+nombre;
	}

}
