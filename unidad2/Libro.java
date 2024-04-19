package unidad2;
/**
 * 
 * Clase que representa
 * libro con atributos de 
 * titulo, autor, editorial, año, clasificacion
 * (0...9) y los metodos get/set necesarios para manipular
 * @author bryanttrujillo
 * 3 mar. 2022 20:37:52
 *
 */
public class Libro {
	private String titulo; 
	private String autor;
	private String editorial;
	private int año;
	private int clasifiacion;
	public Libro(String titulo, String autor, String editorial, int año, int clasifiacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.año = año;
		this.clasifiacion = clasifiacion;
	}
	@Override
	public String toString() {
		return  titulo + "\t" + autor + "\t" + editorial + "\t" + año + "\t" + clasifiacion ;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public int getClasifiacion() {
		return clasifiacion;
	}
	public void setClasifiacion(int clasifiacion) {
		this.clasifiacion = clasifiacion;
	}
	

}
