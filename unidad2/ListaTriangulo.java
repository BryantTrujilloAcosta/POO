package unidad2;
/**
 * usa la clase Triangulo.java
 * para crear una lista de objetos tipo Triangulo
 * @author bryanttrujillo
 */
import java.util.ArrayList;
public class ListaTriangulo {

	public static void main(String[] args) {
		double base[]= {10,20,30,15};
		double altura[]= {3,6,8,5};
		ArrayList <Triangulo> lista = new ArrayList <Triangulo>();
		for(int i=0; i<base.length;i++) {
			Triangulo t = new Triangulo(base[i],altura[i]);
			lista.add(t);
		}
		for(Triangulo tri:lista)
			System.out.println(tri);
		System.out.println();
		//cambia la altura a 30 del triangulo 1
		System.out.println("Cambia la altura a 30 del triangulo 2 de la lista");
		lista.get(1).setAltura(30);
		for(Triangulo tri:lista)
			System.out.println(tri);
		System.out.println();
		
		//cambia la altura de todos por 6
		System.out.println("cambia la altura de todos por 6");
		for(int i=0; i<lista.size();i++) {
			lista.get(i).setAltura(6);
		}
		for(Triangulo tri:lista)
			System.out.println(tri);
		System.out.println();
		//muestra la base del triangulo 0
		System.out.println("muestra la base del triangulo 0");
		double n = lista.get(0).getBase();
		System.out.println(n);
		System.out.println("Se agrego un nuevo triangulo");
		lista.add(new Triangulo(20,30));
		for(Triangulo tri:lista)
			System.out.println(tri);
		System.out.println();
		
		for(Triangulo tri: lista)
			System.out.println("Area "+tri.area());
	
	
		
	}

}
