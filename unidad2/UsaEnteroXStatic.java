package unidad2;
/**
 * 
 * programa que usa la clase
 * EnteroXStatic.java donde se crean 2 
 * objetos pero como es static el atributo
 * solo dara como resultado el ultimo valor
 * que este haya tomado
 * @author bryanttrujillo
 * 27 feb. 2022 17:53:52
 *
 */
public class UsaEnteroXStatic {

	public static void main(String[] args) {
		EnteroXStatic unaX = new EnteroXStatic();
		EnteroXStatic  otraX = new EnteroXStatic();
		
		unaX.setX(10);
		otraX.setX(50);
		
		System.out.println("unaX.getX = " + unaX.getX());
		System.out.println("otraX.getX = " + otraX.getX());

	}

}
