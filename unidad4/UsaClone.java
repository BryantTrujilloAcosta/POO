package unidad4;
/**
 * Tarea 5
 * Clase usa clone en este caso clonar 
 * clientes
 * @author bryanttrujillo
 * 8 may. 2022 15:16:55
 *
 */
public class UsaClone {

	public static void main(String[] args) {
		Cliente p1 = new Cliente("Bryant","Trujillo",20,'H',"1234551");
		
	    Object p2 = p1.clone();
	    Cliente p3 = (Cliente)p2;
	    Cliente p4 = (Cliente) p1.clone();
	    System.out.println("Cliente 1 "+ p1);
	    System.out.println("Cliente 2 "+ p2);
	    System.out.println("Cliente 3 "+ p3);
	    p1.setNombre("Roman");
	    p1.setId("442574");
	    p3.setNombre("Martin");
	    p3.setEdad(23);
	    System.out.println("Cliente 1 "+p1);
	    System.out.println("Cliente 3 "+p3);
	    System.out.println("Cliente 4 "+p4);

	}

}
