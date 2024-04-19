 /**
 * 
 */
package unidad2;

/**
 * Clase que representa
 * producto con atributos codigo, nombre
 * precio, existencia con metodo get para todos
 * y set para precio y existencia
 * @author bryanttrujillo
 * 20 feb. 2022 01:18:32
 *
 */
public class Producto {
	//atributos
	private String codigo;
	private String nombre;
	private double precio; 
	private int cantidad;
	//constructor
	public Producto(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return codigo+"\t"+nombre+"\t"+precio+"\t"+cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public double precioPagar() {
		return cantidad*precio;
	}

}
