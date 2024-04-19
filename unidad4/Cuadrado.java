package unidad4;
/**
 * Tarea 7
 * Clase Cuadrado que extiende de la clase figura
 * @author bryanttrujillo
 * 8 may. 2022 16:04:34
 *
 */
public class Cuadrado extends FiguraGeometrica{
	private double lado;
	public Cuadrado(String color, double lado) {
		super("Cuadrado",color);
		this.lado=lado;
	}
	public double getLado() {
		return lado;
	}
	public double area() {
		return lado*lado;
	}
	public double perimetro() {
		return lado*4;
	}
	
	public String toString() {
		return super.toString()+"\t"+"Lado: "+lado+"\t"+"Área: "+this.area()+"\t"+"Perimetro: "+this.perimetro();
	}

}
