/**
 * 
 */
package unidad2;
/**
 * programa que usa la clase Punto.java
 * que crea puntos con valores guardados en x, y
 *  y los guarda en un array
 * e imprime la cantidad de puntos creados
 * @author bryanttrujillo
 * 26 feb. 2022 04:19:43
 *
 */
import java.util.Scanner;
public class UsaPunto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int x=0;
		int y=0;
		Punto []puntos = new Punto[10];
		for(int i=0; i<puntos.length;i++) {
		System.out.println("Dame el valor de x"+i);
		x = entrada.nextInt();
		System.out.println("Dame el valor de y"+i);
		y = entrada.nextInt();
        puntos[i] = new Punto(x,y);
		}
		for(Punto p: puntos)
			System.out.println(p);
	    
			System.out.println(Punto.getTotalPuntos());
			
		
		Punto punto1 = new Punto(2,1); 
		Punto punto2 = new Punto(5,5); 
	/*
		Punto punto3 = punto1;
		System.out.println("Punto 1 = "+punto1);
		System.out.println("Punto 2 = "+punto2.toString());
	    Punto[]puntos = {punto1, punto2};
		System.out.println(Arrays.toString(puntos));
		System.out.println("Puntos creados"+ Punto.totalPuntos);
		*/
	}

}

