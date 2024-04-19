package unidad4;
/**
 * Tarea 5
 * Clase cliente que extiende de persona
 * @author bryanttrujillo
 * 8 may. 2022 15:12:56
 *
 */
public class Cliente extends Persona{
	protected String id;
    public Cliente(String nombre, String apellido, int edad, char sexo, String id) {
		super(nombre, apellido, edad, sexo);
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id; 
	}	
	public String toString() {
		return super.toString()+id;
	}

}
