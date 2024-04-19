package Unidad3;
/**
 * TAREA 8 
 * Clase que representa Empleado
 * con metodo abstracto para el sueldo
 * @author bryanttrujillo
 * 29 abr. 2022 03:31:58
 *
 */
public abstract class Empleado extends Persona{
	private String oficio;
	private String id;
	
	public Empleado(String nombre, String apellido, int edad, char sexo,String oficio,String id) {
		super(nombre,apellido,edad,sexo);
		this.oficio = oficio;
		this.id = id;
	}
	
	public abstract double sueldo();
	
	public String toString() {
		return super.toString()+"\t"+oficio+"\t"+id+"\t";
	}

}
