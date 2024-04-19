package unidad2;
/*
 * autor:Bryant Trujillo Acosta
 * Programa para usar la clase Contacto.java
 * creando una lista de objetos de tipo contacto 
 * guardandolos en un arraylist para almacenar 
 * los objetos
 */
import java.util.ArrayList;
public class Grupo {

	public static void main(String[] args) {
		String [] nombres = {"Bryant","Maria","Juan","Pedro","daniela"};
		char [] sexo = {'H','M','H','H','M'};
		String [] alias = {"flaco","Mari","gordo","cabezon","dani"};
		char [] tipoTelefono= {'m','c','m','c','m'};
		String [] telefono = {"747417274","424525","4242425","73353555","525563446"};
		ArrayList<Contacto> directorio = new ArrayList<Contacto>();
		for(int i=0; i<nombres.length; i++) {
			Contacto p = new Contacto (nombres[i],sexo[i],alias[i]);
			p.setTelefono(telefono[i]);
			p.SetTipoTelefono(tipoTelefono[i]);
			directorio.add(p);
		}
		for(Contacto p: directorio)
			System.out.println(p);
		
		
		System.out.println("\tLista de mujeres");
		for(int i=0;i<directorio.size();i++) {
			if(directorio.get(i).getSexo()=='M') {
				System.out.println(directorio.get(i).toString());
			}
		}
		System.out.println("\tSe elimino a juan");
		directorio.remove(2);
		for(Contacto p: directorio)
			System.out.println(p);
		
		System.out.println("\tSolo el telefono de la primera persona");
		String t = directorio.get(0).getTelefono();
		System.out.println(t);
		
		System.out.println("\tmuestra la segunda persona de la lista");
		System.out.println(directorio.get(1).toString());
		
		System.out.println("\t cambia el alias de la primer persona");
		directorio.get(0).setAlias("gordo");
		for(Contacto p: directorio)
			System.out.println(p);
		
		System.out.println("\t lista de los nombres de las personas");
		for(int i=0; i<directorio.size(); i++)
		System.out.println(directorio.get(i).getNombre().toString());
		
		System.out.println("\t cambia el mismo tipo de telefono a todos");
		for(int i=0; i<directorio.size();i++) {
			directorio.get(i).SetTipoTelefono('m');
		}
		for(Contacto p: directorio)
			System.out.println(p);
		
		System.out.println("\t muestra solo los hombres");
		for(int i=0; i<directorio.size();i++) {
			if(directorio.get(i).getSexo()=='H') {
			System.out.println(directorio.get(i).toString());
			}
		}
		directorio.add(new Contacto("Maria",'M',"mari"));
		System.out.println("buscando a maria");
		for(Contacto c: directorio)
			if(c.getNombre().equals("Maria"))
				System.out.println(c);
			
		
		
		
	}
	  
	
}


