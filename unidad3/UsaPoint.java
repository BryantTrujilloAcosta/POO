package Unidad3;
/**
 * 
 * Tarea 2 
 * usa las clases Point.java y ColorPoint.java
 * @author bryanttrujillo
 * 5 abr. 2022 01:46:29
 *
 */
public class UsaPoint {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(3,5);
		ColorPoint cp1 = new ColorPoint();
		System.out.println("p1 = "+p1);
		System.out.println("p2 = "+p2);
		System.out.println("cp1 = "+cp1);
		cp1.setX(4);
		System.out.println("cambió x en cp1 = "+cp1);
		p1.setY(9);
		System.out.println("cambio y en p1 = "+p1);
		System.out.println("genera un nuevo punto con medio "+p2.medio(p1));
		System.out.println("cambio color cp1 = "+cp1);

	}

}
