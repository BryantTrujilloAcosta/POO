package unidad2;
/* 
 * Clase que representa Triangulo que tiene como
 * atributos base, altura y area, con metodos get y set
 * y recibe como parametros en el constuctor a base y altura
 * @author bryanttrujillo
 */
public class Triangulo {
	//atributos
	private double base;
	private double altura;
	//constructor con los 2 parametros para los atributos
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "base "+base+"\t"+"altura "+altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double area() {
		return (this.base*this.altura)/2;
	}
	
	}
	
