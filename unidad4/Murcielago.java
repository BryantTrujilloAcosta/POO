package unidad4;
/**
 * Tarea 8
 * Clase murcielago que usa la interface Animal
 * @author bryanttrujillo
 * 15 may. 2022 21:24:28
 *
 */
public class Murcielago extends Animales implements Animal {
	private String nombre;
	public Murcielago(String nombre) {
		super("Murcielago");
		this.nombre=nombre;
	}
	public void locomotion() {
		System.out.println("Estoy volando");
	}
	public void eat() {
		System.out.println("como insectos");
	}
	public String toString() {
		return super.toString()+" , me llamo "+nombre;
	}

}
