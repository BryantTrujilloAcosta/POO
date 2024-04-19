/**
 * 
 */
package unidad2;

/**
 * programa que usa EnteroX.java
 * @author bryanttrujillo
 * 27 feb. 2022 17:30:28
 *
 */
public class UsaEnteroX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EnteroX unaX = new EnteroX();
		EnteroX otraX = new EnteroX();
		unaX.setX(10);
		otraX.setX(50);
		System.out.println("unaX.getX = "+unaX.getX());
		System.out.println("otraX.getX = "+otraX.getX());


	}

}
