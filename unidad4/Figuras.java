package unidad4;
/**
 * TAREA 7
 * Clase que menu de figuras geometricas 
 * almacena en un Arraylist
 * @author bryanttrujillo
 * 8 may. 2022 16:27:34
 *
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
public class Figuras {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double radio=0;
		double lado=0;
		double base =0;
		double altura =0;
		String color;
		Circulo f1 = new Circulo("rojo",7);
		Cuadrado f2 = new Cuadrado("rojo",5);
		Triangulo f3 = new Triangulo("verde",5,7,10);
		System.out.println(f1.equals(f2));
		ArrayList<FiguraGeometrica> lista = new ArrayList<FiguraGeometrica>();
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		boolean salir = false;
		String opcion;
		while (!salir) {
			System.out.println("a. mostrar figuras");
			System.out.println("b. crear cuadrado");
			System.out.println("c. crear circulo");
			System.out.println("d. crear Triangulo");
			System.out.println("e. mostrar solo cuadrados");
			System.out.println("f. mostrar circulos");
			System.out.println("g. mostrar triangulos");
			System.out.println("h. mostrar el color de la figura mas grande");
			try {
				System.out.println("Escribe una de las opciones");
				opcion = entrada.next();
				switch(opcion) {
				case "a":
				  for(FiguraGeometrica f: lista)
					  System.out.println(f);
				  break;
				case "b":
					System.out.println("dame el color del cuadrado");
					color = entrada.next();
					System.out.println("dame el lado del cuadrado");
					lado = entrada.nextDouble();
					Cuadrado c1 = new Cuadrado(color,lado);
					lista.add(c1);
					break;
				case "c":
					System.out.println("dame el color del circulo");
					color = entrada.next();
					System.out.println("dame el radio del circulo");
					radio = entrada.nextDouble();
					Circulo c2 = new Circulo(color,radio);
					lista.add(c2);
					break;
				case "d":
					System.out.println("dame el color del triangulo");
					color = entrada.next();
					System.out.println("dame el valor de la base ");
					base = entrada.nextDouble();
					System.out.println("Dame el valor del lado");
					lado = entrada.nextDouble();
					System.out.println("Dame el valor de la altura");
					altura = entrada.nextDouble();
					Triangulo t1 = new Triangulo(color,base,altura,lado);
					lista.add(t1);
					break;
					
				case "e":
					for(FiguraGeometrica c: lista)
						if(c.getTipo()=="Cuadrado")
						System.out.println(c);
					break;
				case "f":
					for(FiguraGeometrica c: lista)
						if(c.getTipo()=="Circulo")
							System.out.println(c);
					break;
				case "g":
					for(FiguraGeometrica c: lista)
						if(c.getTipo()=="Triangulo")
							System.out.println(c);
					break;
				case "h":
					double mayor=0;
					String colores="";
					for(FiguraGeometrica c:lista)
						if(c.area()>mayor) {
							mayor = c.area();
					        colores = c.getColor();
						}
		               System.out.println(colores);
					break;
	
				}
			
			}catch(InputMismatchException e) {
				System.out.println("Debes insertar una letra");
				entrada.next();
			}
		}
		

	}

}
