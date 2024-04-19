package Unidad3;
/**
 * 
 * Clase que representa
 * @author bryanttrujillo
 * 5 abr. 2022 02:05:24
 *
 */
public class Animal {
	private String especie;
	public Animal (String especie) {
		this.especie = especie;
	}
	public String getEspecie() {
		return especie;
	}
	public void printMensaje() {
		System.out.println("soy animal de especie "+especie);
	}
	public String toString() {
		return "Animal"+especie;
	}

}
