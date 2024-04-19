package Unidad3;
/**
 * Tarea 7 
 * Clase que representa Telefono.java
 * @author bryanttrujillo
 * 28 abr. 2022 02:39:39
 *
 */
public class Telefono {
	private char tipoTelefono;
	private String clavePais;
	private String numeroTelefonico;
	
	public Telefono(char tipoTelefono, String clavePais, String numeroTelefonico) {
		this.tipoTelefono = tipoTelefono;
		this.clavePais = clavePais;
		this.numeroTelefonico = numeroTelefonico;
	}
	@Override
	public String toString() {
		return "\t"+tipoTelefono + "\t" + clavePais + "\t"+ numeroTelefonico;
	}
	public char getTipoTelefono() {
		return tipoTelefono;
	}
	public void setTipoTelefono(char tipoTelefono) {
		String tel = Character.toString(tipoTelefono);
		if(tel.equalsIgnoreCase("m")|| tel.equalsIgnoreCase("f")) {
			this.tipoTelefono = tipoTelefono;
		}
		else {
			System.out.println("El tipo de telefono debe ser movil(m) o fijo(f)");
		}
	
		}
	public String getClavePais() {
		return clavePais;
	}
	public void setClavePais(String clavePais) {
		if(clavePais.length()==10) {
			this.clavePais=clavePais;
		}
		else {
			System.out.println("La clave del pais debe tener solo 2 digitos ");
		}
	}
	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}
	public void setNumeroTelefonico(String numeroTelefonico) {
		if(numeroTelefonico.length()==10){
			this.numeroTelefonico = numeroTelefonico;
		}
		else {
			System.out.println("El telefono debe tener 10 digitos ");
		}
	}
	

}
