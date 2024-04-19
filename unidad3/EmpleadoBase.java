package Unidad3;
/**
 * 
 * Clase que representa empleado base
 * que hereda los atributos de la clase
 * Empleado, tiene un metodo abstract para el sueldo
 * @author bryanttrujillo
 * 
 *
 */
public class EmpleadoBase extends Empleado{
	private double sueldoBase=0;

	public EmpleadoBase(String nombre, String apellido, int edad, char sexo, String oficio, String id,
			double sueldoBase) {
		super(nombre, apellido, edad, sexo, oficio, id);
		this.sueldoBase = sueldoBase;
	}
	
	public double sueldo() {
	return sueldoBase;
}

	@Override
	public String toString() {
		return super.toString()+" sueldo base: "+sueldoBase;
	}
	

}
