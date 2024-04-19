package unidad2;

public class UsaLibro {

	public static void main(String[] args) {
		String titulo[]= {"Don quijote","Historia de dos ciudades","El señor de los anillos","El principito","El hobbit"}; 
		String autor[]={"Miguel Cervantes","Charles Dickens","J.R.R Tolkien","Antonie de Saint-Exupery","J.R.R. Tolkien"};
		String editorial[]= {"Tomas Gorchs","Alianza","Boocket","Salamandra","Minotauro"};
		int año[]= {1859,2015,2012,2001,2011};
		char clasificacion[]= {'8','8','8','3','4'};
		Libro libros[] = new Libro[titulo.length];
		for(int i=0; i<titulo.length;i++) {
			libros[i] = new Libro(titulo[i],autor[i],editorial[i],año[i],clasificacion[i]);
		}
		for(Libro l: libros )
	
			System.out.println(l);
		int contarLibros=0;
		for(int i=0; i<libros.length;i++) {
			if(libros[i].getClasifiacion()=='8') {
			}
		System.out.println(libros.toString());	
		}
		

	}

}
