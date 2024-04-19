package Unidad3;
/**
 * 
 * Clase que representa
 * EmpComision que hereda los atributos de clase
 * de Empleado con un metodo abstract para el sueldo
 * @author bryanttrujillo
 *
 */
public class EmpComision extends Empleado{
	private double porcentaje=0;
	private int venta =0;
	private double precioVenta=0;
	public EmpComision(String nombre, String apellido, int edad, char sexo, String oficio, String id, double porcentaje,
			int venta, double precioVenta) {
		super(nombre, apellido, edad, sexo, oficio, id);
		this.porcentaje = porcentaje;
		this.venta = venta;
		this.precioVenta = precioVenta;
	}
	public double sueldo() {
		double sueldoComision =0;
		double x=porcentaje/100;
		double totalDeVenta= venta *precioVenta;
		return sueldoComision+totalDeVenta*x;
	}
	public String toString() {
		return super.toString()+porcentaje+"\t"+venta+"\t"+precioVenta;
	}
	

}
