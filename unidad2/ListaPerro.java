package unidad2;
/*
 * Autor: Bryant Trujillo Acosta
 * programa para usar la clase Perro.java
 * creando una lista de objetos de tipo perro
 * guardandolo en un arraylist
 */
import java.util.ArrayList;
public class ListaPerro {

	public static void main(String[] args) {
		String [] nombre = {"Rocky","Coby","Scooby","Zeus"};
		char [] sexo = {'M','M','M','M'};
		String [] raza = {"Doberman","Pomeranian","Gran danes","Pitbull Terrier"};
		int [] edad = {4,3,5,2};
		String [] color = {"Negro","Blanco","Cafe","Gris"};
		float [] peso = {40,2,60,20};
		ArrayList <Perro> lista = new ArrayList<Perro>();
		for(int i=0; i<nombre.length;i++) {
			Perro p = new Perro(nombre[i],sexo[i],raza[i]);
			p.setColor(color[i]);
			p.setEdad(edad[i]);
			p.setPeso(peso[i]);
			lista.add(p);
		}
		for(Perro p:lista)
			System.out.println(p);
		System.out.println();
		//muestra el nombre del 3 perro de la lista
		System.out.println(lista.get(2).getNombre().toString());
		System.out.println();
		
		lista.get(2).setColor("negro");
		for(Perro p:lista)
			System.out.println(p);
		System.out.println();
		//promedio edades
		float promedio = 0;
		int suma = 0;
		for(int i=0; i<lista.size();i++) {
			suma+=lista.get(i).getEdad();
			promedio = (float) suma/lista.size();
		}
		System.out.println("Promedio de edades "+promedio);
		
		//promedio peso
	    float promedio2 = 0;
		int suma2 = 0;
		for(int i=0; i<lista.size();i++) {
			suma2+=lista.get(i).getPeso();
			promedio2 = (float) suma2/lista.size();		
		}
		System.out.println("Promedio de peso "+promedio2);
		
		System.out.println(lista.get(2).getRaza().toString());
		for(Perro p: lista)
			System.out.println(p.getNombre()+" Edad equivalente a persona "+p.edadPerroPersona());
	

	}

}
