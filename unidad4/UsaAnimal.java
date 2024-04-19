package unidad4;
/**
 * Tarea 8 
 * usa la interface Animal y la clase Animales y todas sus clases
 * derivadas 
 */
import java.util.ArrayList;

public class UsaAnimal {

	public static void main(String[] args) {
		ArrayList<Animal> lista = new ArrayList<Animal>();
		Ballena ballena = new Ballena("beto");
		Murcielago murcielago = new Murcielago("mauricio");
		Murcielago murcielago2 = new Murcielago("roberto");
		Abeja abeja = new Abeja("Ben");
		Pato pato = new Pato("donald");
		lista.add(murcielago);
		lista.add(ballena);
		lista.add(abeja);
		lista.add(pato);
		for(Animal a: lista)
			System.out.println(a);
		System.out.println("¿mauricio y roberto son murcielagos?");
		System.out.println(murcielago.equals(murcielago2));
		System.out.println("¿donald y ben son la misma especie?");
		System.out.println(pato.equals(abeja));
	}

}
