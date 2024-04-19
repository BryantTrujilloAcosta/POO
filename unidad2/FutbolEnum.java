package unidad2;
/**
 * 
 * Clase que representa
 * programa para usar Futbol.java que es
 * una enumeracion    
 * @author bryanttrujillo
 * 26 feb. 2022 04:07:23
 *
 */
public class FutbolEnum {

	public static void main(String[] args) {
	
		Futbol delantero = Futbol.DELANTERO;
		Futbol defensa = Futbol.DEFENSA;
				
		// Devuelve un String con el nombre de la constante
		System.out.println("delantero.name()= "+delantero.name());
		System.out.println("defensa.toString()= "+defensa.toString());
				
		//  Devuelve un entero con la posición de la constante según está declarada.
		System.out.println("delantero.ordinal()= "+delantero.ordinal());
				
		// Compara el enum con el parámetro según el orden en el que están declaradas las constantes. 
		System.out.println("delantero.compareTo(portero)= "+delantero.compareTo(defensa));
		System.out.println("delantero.compareTo(delantero)= "+delantero.compareTo(delantero));
				
		// Recorre todas las constantes de la enumeración
		for(Futbol d: Futbol.values()){
			System.out.println(d.toString()+" - ");
		}
	}

}
