package unidad2;
/**
 * 
 * programa que usa la clase Fruta.java
 * para crear objetos de tipo fruta
 * leer nombre,gramos y caloriasporgramo
 * @author bryanttrujillo
 * 27 feb. 2022 16:15:46
 *
 */
import java.util.ArrayList;
import java.util.Scanner;
public class UsaFruta {

	public static void main(String[] args) {
	  Scanner entrada = new Scanner (System.in);
	  String nombre = "";
	  int pesoGramos;
	  int caloriasPorGramo;
	  ArrayList<Fruta>lista = new ArrayList<Fruta>();
	  for(int i=0;i<2;i++) {
		  System.out.println("Dame el nombre de la fruta");
		  nombre=entrada.next();
		  System.out.println("Dame el peso por gramo");
		  pesoGramos=entrada.nextInt();
		  System.out.println("Dame las calorias por gramo");
		  caloriasPorGramo=entrada.nextInt();
		  Fruta f = new Fruta(nombre);
		  f.setPeso(pesoGramos);
		  f.setCalorias(caloriasPorGramo);
		  lista.add(f);
	  }
	  for(Fruta f: lista)
		  System.out.println(f);
		
	  for(Fruta f: lista)
		  System.out.println(nombre+" total calorias:"+f.totalCalorias());

	}

}
