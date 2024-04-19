package unidad2;
/**
 * 
 * Clase que representa 
 * Alumnos 
 * @author bryanttrujillo
 * 28 feb. 2022 19:21:19
 *
 */

public class ListaAlumno {

	public static void main(String[] args) {
		Alumno a []= {new Alumno("Bryant","Trujillo",'M',9),new Alumno("Jose","Armenta",'M',8),new Alumno("Maria","Hernandez",'F',7)
		,new Alumno("Luisa","Gutierrez",'F',10),new Alumno("Arturo","Lopez",'M',8),new Alumno("Federico","Felix",'M',5),
		new Alumno("Ana","Martinez",'F',7),new Alumno("Luipita","Sandoval",'F',9),new Alumno("Roberto","Garcia",'M',9)};
		
	    
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
