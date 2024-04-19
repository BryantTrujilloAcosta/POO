package unidad2;

/**
 * Clase que representa
 * usa la clase Producto.java
 * para crear una lista de objetos tipo productos
 * @author bryanttrujillo
 * 20 feb. 2022 01:42:51
 *
 */
import java.util.ArrayList;
public class ListaProducto {
	
	public static void main(String[] args) {
	String [] codigo = {"131341","41443","424242","555255"};
	String [] nombre = {"chicles","galleta","jugo","pan"};
	double [] precio = {5,13,20,5};
	int [] cantidad = {2,3,1,3};
	ArrayList<Producto> lista = new ArrayList<Producto>();
	for(int i=0; i<codigo.length;i++) {
		Producto p = new Producto(codigo[i],nombre[i]);
		p.setPrecio(precio[i]);
		p.setCantidad(cantidad[i]);
		lista.add(p);
	}
	for(Producto p: lista)
		System.out.println(p);
	
		System.out.println();
		
	for(Producto p: lista)
		System.out.println(p.toString()+"\n"+" Precio a pagar "+p.precioPagar());

}
}

