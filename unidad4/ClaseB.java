package unidad4;

public class ClaseB extends ClaseA{
	String nombre = "claseB";
	public String metodo3() {
		return "metodo3";
	}
	public String toString() {
		return super.toString()+nombre;
	}

}
