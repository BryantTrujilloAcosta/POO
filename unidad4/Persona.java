package unidad4;
/**
 * tarea 1, tarea 5
 * Clase persona con atributos y metodos get y set 
 * de cada atributo
 * @author bryanttrujillo
 * 8 may. 2022 09:20:25
 *
 */
public class Persona implements Cloneable{
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected char sexo;
	public Persona(String nombre, String apellido, int edad, char sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
	}
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public boolean equals(Object o){
		boolean res = false;
		if(o instanceof Persona) {
			Persona p = (Persona)o;
			res = (nombre.equalsIgnoreCase(nombre)==p.nombre.equalsIgnoreCase(nombre));
		}
		return res;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public final String nombre() {
		System.out.println(nombre);
		return nombre;
	}
	public Object clone() {
		Object obj = null;
		try {
			obj=super.clone();
		}catch(CloneNotSupportedException ex) {
			System.out.println("No se puede duplicar");
		}
		return obj;
	}
	
	public String toString() {
		return nombre +", "+ apellido + ", " + edad + ", " + sexo;
	}
	

}
