package Unidad3;
/**
 * Tarea 2
 * Clase que usa ColorPunto.java y D3Punto.java
 * @author bryanttrujillo
 * 5 abr. 2022 02:04:05
 *
 */
public class UsaD3Punto {

	public static void main(String[] args) {
		D3Punto p1 = new D3Punto();
		D3Punto p2 = new D3Punto(3,5,6);
		ColorPunto cp1 = new ColorPunto();
		ColorPunto cp2 = new ColorPunto();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(cp1);
		cp1.setX(4);
		System.out.println(cp1);
		cp1.setY(9);
		cp1.setZ(5);
		System.out.println(cp1);
		cp2.setX(3);
		cp2.setY(4);
		cp2.setZ(7);
		System.out.println(cp2);
		System.out.println(p2.medio(p1));
		System.out.println(cp1.medio(cp2));

	}

}
