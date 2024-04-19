package unidad2;
/**
 * 
 * Clase que representa
 * Alumnos con atributos de nombre, apellido, sexo
 * calificacion y metodos get y set para cada atributo
 * @author bryanttrujillo
 * 28 feb. 2022 02:00:11
 *
 */
public class Alumno {
	private String nombre;
	private String apellido;
	private char sexo; 
	private double calificacion;
	public Alumno(String nombre, String apellido, char sexo, double calificacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.calificacion = calificacion;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", calificacion="
				+ calificacion + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	

}
