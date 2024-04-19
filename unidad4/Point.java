package unidad4;
/**
 * 
 * Tarea 2
 * clase point
 * @author bryanttrujillo
 * 8 may. 2022 10:02:04
 *
 */
public class Point {
	protected int x=0;
	protected int y=0;
	public static int totalPuntos=0;
	// a constructor
	public Point() {
		totalPuntos++;
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		totalPuntos++;
	}
	public void setX(int _x) {
		x=_x;
		
	}
	public void setY(int _y) {
		y=_y;
	}
	public int getY() {
		return y;
	}
	public int getX() {
		return x;
	}
	public boolean equals(Object o){
        boolean res = false;
		  if(o instanceof Point){
		  Point p = (Point) o;
	      res = (x==p.x) && (y==p.y);
		  }
		return res;
	}	
	public Point medio(Point p) {
		return new Point((p.x+x)/2, (p.y+y)/2);
	}
	public String toString() {
		return "("+x+","+y+")";
	}


}
