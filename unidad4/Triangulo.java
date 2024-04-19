package unidad4;
/**
 * Tarea7 
 * Clase Triangulo 
 * @author bryanttrujillo
 * 8 may. 2022 23:40:46
 *
 */
public class Triangulo extends FiguraGeometrica{
	private double base;
	private double altura;
	private double lado;
	public Triangulo (String color, double base, double altura, double lado) {
		super("Triangulo",color);
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	public double getLado() {
		return lado;
	}
	public double area() {
	    return (base*altura)/2;
	}
	public double perimetro() {
		return lado+base+lado;
	}
	
	public String toString() {
		return super.toString()+"\t"+"Base: "+base+"\t"+"Altura: "+altura+"\t"+"Lado: "+lado+"\t"+"Área: "+this.area()+"\t"+"Perimetro: "+this.perimetro();
	}
	

}
