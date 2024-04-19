package unidad4;
/**
 * Tarea 7 
 * Clase abstracta figura con atributo color
 * y metodo abstracto para area y perimetro
 * @author bryanttrujillo
 * 8 may. 2022 16:02:00
 *
 */
public abstract class FiguraGeometrica {
	private String color;
	private String tipo;
	public FiguraGeometrica(String tipo, String color) {
		this.tipo = tipo;
		this.color = color;
	}
	public String getTipo() {
		return tipo;
	}
	public String getColor() {
		return color;
	}
	public boolean equals(Object o) {
		boolean res = false;
		if(o instanceof FiguraGeometrica) {
			FiguraGeometrica f = (FiguraGeometrica)o;
		res = (color==f.color);
		}
		return res;
		}
	abstract double area();
	abstract double perimetro();
	public String toString() {
		return tipo+" "+color+"\t";
	}
	

}
