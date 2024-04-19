package unidad2;
/*
 * Autor: Bryant Trujillo Acosta
 * clase Contacto.java
 * atributos: nombre, sexo, alias, teléfono, tipo teléfono
 * métodos: get/set para los atributos y toString constructor: 
 * con 2 parámetros (nombre y alias)
 */
public class Contacto {
	//atributos
	private String nombre;
	private char sexo;
	private String alias;
	private String telefono;
	private char tipoTelefono;
	
	//constructor con los 2 parametros para los atributos nombre y alias 
	public Contacto(String nombre, char sexo, String alias) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.alias = alias;
	}
	@Override
	public String toString() {
		return nombre+"\t"+sexo+"\t"+alias+"\t"+tipoTelefono+"\t"+telefono;
	}
	//obtiene el nombre de la persona
	public String getNombre() {
		return this.nombre;
	}
	//cambia el nombre de la persona
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//obtiene el sexo
	public char getSexo() {
		return this.sexo;
	}
	//Obtiene el alias
	public String getAlias() {
		return this.alias;
	}
	//cambia el alias
	public void setAlias(String alias) {
		this.alias = alias;
	}
	//Obtiene el telefono
	public String getTelefono() {
		return this.telefono;
	}
	//cambia el telefono
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	//Obtiene el tipo de telefono
	public char getTipoTelefono() {
		return this.tipoTelefono;
	}
	//cambia el tipo de telefono
	public void SetTipoTelefono(char tipoTelefono) {
		this.tipoTelefono = tipoTelefono;
	}


  
	

}
