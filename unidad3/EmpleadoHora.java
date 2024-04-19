package Unidad3;
/**
 * 
 * Clase que representa EmpleadoHora
 * que hereda los miembros de la clase
 * padre que es Empleado
 * @author bryanttrujillo
 * 
 *
 */
public class EmpleadoHora extends Empleado{
	private int horasTrabajadas=0;
	private double sueldoPorHora=0;
	public EmpleadoHora(String nombre, String apellido, int edad, char sexo, String oficio, String id,
			int horasTrabajadas, double sueldoPorHora) {
		super(nombre, apellido, edad, sexo, oficio, id);
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoPorHora = sueldoPorHora;
	}
	
	public double sueldo() {
		double sueldo = this.horasTrabajadas*this.sueldoPorHora;
		return sueldo;
	}
	
	public String toString() {
		return super.toString()+ "horas trabajadas"+horasTrabajadas+"\t sueldo PorHora "+sueldoPorHora;
	}

}
