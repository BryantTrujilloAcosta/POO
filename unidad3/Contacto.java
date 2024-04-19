package Unidad3;
import java.util.ArrayList;
/**
 * tarea 7
 * Clase que representa Contacto.java
 * hereda miembros de la clase persona
 * y tiene una lista de tipo Telefono
 * @author bryanttrujillo
 *
 */
public class Contacto extends Persona{
	protected ArrayList <Telefono> listaTelefono;
	
	public Contacto(String nombre, String apellido, int edad, char sexo) {
		super(nombre, apellido, edad, sexo);
		this.listaTelefono = new ArrayList<>();
	}
	
	public ArrayList<Telefono> getTelefono() {
		return listaTelefono;
	}

	public void setTelefono(ArrayList<Telefono> telefono) {
		this.listaTelefono = telefono;
	}
	
	public void añadirTelefono(Telefono tel) {
		this.listaTelefono.add(tel);
	}
	
	public void listarTelefono() {
		for(Telefono telefono: listaTelefono)
			System.out.println(telefono);
	}
	
	public void eliminarTelefono(String telefono) {
	for(int i=0; i<listaTelefono.size();i++) {
		if(getTelefono().get(i).getNumeroTelefonico().equalsIgnoreCase(telefono)) {
			listaTelefono.remove(i);
			for(Telefono telefono1: listaTelefono)
				System.out.println(telefono1);
		}
	}
}



	@Override
	public String toString() {
		return  super.toString()+listaTelefono;
	}
	
	
	

}
