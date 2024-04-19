package unidad4;
/**
 * TAREA 4
 * Clase Color Point con el metodo equals
 * @author bryanttrujillo
 * 8 may. 2022 11:04:58
 *
 */
public class ColorPoint extends Point {
	private String color = "rojo";
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	public String toString() {
		return super.toString()+"."+color;
	}
	public boolean equals(Object o) {
		boolean res = false;
		if(o instanceof ColorPoint) {
			ColorPoint c = (ColorPoint)o;
			res = super.equals(c)&& color.equals(c.color);	
		}
		return res;
	}

}
