package unidad4;
/**
 * Tarea 1
 * clase Alumno que extiende de la clase persona
 * @author bryanttrujillo
 * 8 may. 2022 09:20:41
 *
 */
public class Alumno extends Persona {
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
	/* metodo Final
	public String nombre() {
		System.out.println(nombre+matricula);
		return this.matricula+nombre;
	}
    */ 

	public String toString() {
		return  super.toString()+ matricula;
	}
	

}
