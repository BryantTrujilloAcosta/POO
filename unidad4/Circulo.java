package unidad4;
/**
 * Tarea 7 clase circulo que extiende de la clase figura
 * Clase que representa
 * @author bryanttrujillo
 * 8 may. 2022 16:07:33
 *
 */
public class Circulo extends FiguraGeometrica{
	private double radio;
	public Circulo(String color, double radio) {
		super("Circulo",color);
		this.radio=radio;
	}
	public double getRadio() {
		return radio;
	}
	public double area() {
		return (double)Math.round(Math.PI*radio*radio*100d)/100;
	}
	public double perimetro() {
		return  (double)Math.round(2*Math.PI*radio*100d)/100;
	}
	public String toString() {
		return super.toString()+"\t"+"Radio: "+radio+"\t"+"Área: "+this.area()+"\t"+"Perimetro: "+this.perimetro();
	}

}
