package unidad4;
/**
 * 
 *Clase Abajo que usa la interface Animal
 * @author bryanttrujillo
 * 15 may. 2022 21:25:24
 *
 */
public class Abeja extends Animales implements Animal {
	private String nombre;
	public Abeja(String nombre) {
		super("Abeja");
		this.nombre=nombre;
	}
	public void locomotion() {
		System.out.println("estoy volando");
	}
	public void eat() {
		System.out.println("como polen");
	}
	public String toString() {
		return super.toString()+" , me llamo "+nombre;
	}

}
