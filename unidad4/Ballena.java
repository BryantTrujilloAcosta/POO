package unidad4;
/**
 * 
 *Clase Ballena que usa la interface Animal
 * @author bryanttrujillo
 * 15 may. 2022 21:24:59
 *
 */
public class Ballena extends Animales implements Animal {
	private String nombre;
	
	public Ballena(String nombre) {
		super("Ballena");
		this.nombre=nombre;
	}
	public void locomotion() {
		System.out.println("Estoy nadando");
	}
	public void eat() {
		System.out.println("Como crustáceos");
	}
	public String toString() {
		return super.toString()+" , me llamo "+nombre;
	}

}
