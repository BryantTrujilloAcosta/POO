package Unidad3;
/**
 * Tarea 7 
 * Clase que representa Alumno.java
 * hereda los miembros de la clase Persona.java
 * @author bryanttrujillo
 *
 */
public class Alumno extends Persona{
	protected String matricula;

	public Alumno(String nombre, String apellido, int edad, char sexo, String matricula) {
		super(nombre, apellido, edad, sexo);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return  super.toString()+ matricula;
	}
	

}
