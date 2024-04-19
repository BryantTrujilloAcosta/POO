package unidad2;
/*
 * Autor: Bryant Trujillo Acosta
 * Fecha: 16/febrero/2022
 * Programa para usar la clase Persona.java
 * creando una lista de objetos de tipo persona 
 * usa ArraysList para almacenar los objetos
 */
import java.util.ArrayList;
public class ListaPersonas {
	public static void main(String[] args) {
		//creacion de objetos
		Persona p1 = new Persona("Juan",'H',5,70,1.70);
		Persona p2 = new Persona("Maria",'M',50,60,1.60);
		Persona p3 = new Persona("Carlos",'H',18,80,1.90);
		
   //imprime los objetos
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3);
		
		
	  //crea la lista de personas(vacia)
		 ArrayList<Persona> lista = new ArrayList<Persona>();
		 
	  //agrega elementos a la lista
		 lista.add(p1);
		 lista.add(p2);
		 lista.add(p3);
		 
	  //imprime la listta con todos los elementos
		 System.out.println(lista.toString());
		 for(Persona p: lista)
			 System.out.println(p.getNombre()+" IMC "+p.imc());
		 

	}

}
