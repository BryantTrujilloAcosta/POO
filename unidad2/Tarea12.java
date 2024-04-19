package unidad2;
/**
 * 
 * Clase que contiene los metodos 
 * de la tarea 12
 * @author bryanttrujillo
 * 27 feb. 2022 21:24:59
 *
 */
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
public class Tarea12 {
/*
 * 1.-Escribe un método que obtenga el número 
 * de letras x que contiene un String(x es un parametro de tipo char)
 * 
 */
	public static int contarLetras(String frase, char x) {
		int cuenta=0;
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==x)cuenta++;
		}
		return cuenta;
	}
/*
 *2.- Escribe un método que reciba como parámetro un String 
 * y obtenga el total de caracteres que son dígitos.
 */
	public static int contarDigitos(String s) {
		int digito=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
			digito++;
			}
		}
		return digito;
	}
/*
 *3.- Escribe un metodo que reciba como parametro un número entero
 *y obtenga como resultado un valor boolean, verdadero si es el numero es par 
 *y falso si es impar
 */
	public static boolean numeroParImpar(int numero) {
		boolean par = false;
		if(numero%2==0) {
			par = true;
		}
		
		return par;
	}
/*
 * 4.-Escribe un metodo que reciba como parametro un entero y determine
 * si este es o no un numero primo
 */
	public static boolean numeroPrimo(int numero) {
		//si el numero es par
		if(numero%2==0) return false;
		//si el numero es  impar
		for(int i=3; i*i<=numero;i+=2) {
			if(numero%i==0) {
				return false;
			}
		}
		//si no se cumple lo de arriba es primo
		return true;
	}
/*
 *5. Escribe un método que reciba un número del 0 a 100 y regrese
 * como resultado el número en letras. 	
 */
	public static String numeroLetras(int numero) {
		String []decimales= {"veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa","cien"};
		String[]numeros= {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve",};
		String[]numeros2= {"diez","once","doce","trece","catorce","quince",};
		String letra="";
		if((numero==0)&&(numero<=9)) {
			for(int i=0; i<numeros.length;i++) {
				letra = numeros[numero];	
			}
		}else if((numero==10)&&(numero<=15)) {
				for(int i=0; i<numeros2.length;i++) {
					letra = numeros2[numero-10];
				}			
		}else if((numero==16)&&(numero<=19)) {
				for(int i=0; i<numeros2.length;i++) {
					letra = numeros2[0]+" y "+numeros[numero-10];
				}
		}if(numero==20){
				for(int i=0; i<decimales.length;i++) {
					letra= decimales[0];
				}
		}if((numero>20)&&(numero<=29)) {
			   for(int i=0; i<decimales.length;i++) { 
					letra= decimales[0]+" y "+numeros[numero-20];
				}
		} if(numero==30){
				for(int i=0; i<decimales.length;i++) {
					letra = decimales[1];
				}
		}if((numero>30)&&(numero<=39)) {
		        for(int i=0; i<decimales.length;i++) {
					letra= decimales[1]+" y "+numeros[numero-30];
				}
		}if(numero==40){
			for(int i=0; i<decimales.length;i++) {
				letra = decimales[2];
			}
	    }if((numero>40)&&(numero<=49)) {
	        for(int i=0; i<decimales.length;i++) {
				letra= decimales[2]+" y "+numeros[numero-40];
			}
		}if(numero==50){
			for(int i=0; i<decimales.length;i++) {
				letra = decimales[3];
			}
	    }if((numero>50)&&(numero<=59)) {
	        for(int i=0; i<decimales.length;i++) {
				letra= decimales[3]+" y "+numeros[numero-50];
			}
		}if(numero==60){
			for(int i=0; i<decimales.length;i++) {
				letra = decimales[4];
			}
	    }if((numero>60)&&(numero<=69)) {
	        for(int i=0; i<decimales.length;i++) {
				letra= decimales[4]+" y "+numeros[numero-60];
			}
		}if(numero==70){
			for(int i=0; i<decimales.length;i++) {
				letra = decimales[5];
			}
	    }if((numero>70)&&(numero<=79)) {
	        for(int i=0; i<decimales.length;i++) {
				letra= decimales[5]+" y "+numeros[numero-70];
			}
		}if(numero==80){
			for(int i=0; i<decimales.length;i++) {
				letra = decimales[6];
			}
	    }if((numero>80)&&(numero<=89)) {
	        for(int i=0; i<decimales.length;i++) {
				letra= decimales[6]+" y "+numeros[numero-80];
			}
		}if(numero==90){
			for(int i=0; i<decimales.length;i++) {
				letra = decimales[7];
			}
	    }if((numero>90)&&(numero<=99)) {
	        for(int i=0; i<decimales.length;i++) {
				letra= decimales[7]+" y "+numeros[numero-90];
			}
		}if(numero==100){
			for(int i=0; i<decimales.length;i++) {
				letra = decimales[8];
			}
	    }
			
		return letra;
		
	}
	
	
/*
 * 7 Escribe un método que reciba como parámetro un arreglo de objetos tipo Alumno 
 * y regrese como resultado el numero de mujeres que hay en el grupo.
 */static Alumno a []= {new Alumno("Bryant","Trujillo",'M',90),new Alumno("Jose","Armenta",'M',80),new Alumno("Maria","Hernandez",'F',70)
			,new Alumno("Luisa","Gutierrez",'F',100),new Alumno("Arturo","Lopez",'M',80),new Alumno("Federico","Felix",'M',50),
			new Alumno("Ana","Martinez",'F',40),new Alumno("Luipita","Sandoval",'F',90),new Alumno("Roberto","Garcia",'M',90)};
	
		
	public static int numeroMujeres(Alumno[] grupo) {
		int mujer=0;
		for(int i=0; i<grupo.length;i++) {
			if((grupo[i].getSexo()=='F')|| (grupo[i].getSexo()=='f' )) {
			mujer++;
			}	
		}
		return mujer;
		
	}
 /*
  * 8 Escribe un método que reciba como parámetro un arreglo de Alumno y 
  * regrese el promedio de la calificación de todo el grupo.
  */
	public static float promedioAlumno(Alumno[] calificacion) {
		float promedio=0;
		for(int i=0; i<calificacion.length;i++) {
			promedio += calificacion[i].getCalificacion()/calificacion.length;; 
		
		}
		return  promedio;
	}
/*
 * 9 Escribe un método que reciba como parámetro un arreglo de Alumno 
 * y regrese como resultado el total de alumnos reprobados con calificación menor que 70.
 */
	public static int alumnosReprobados(Alumno[] calificacion) {
		int cuentaAlumno=0;
		for(int i=0;i<calificacion.length;i++) {
			if(calificacion[i].getCalificacion()<70) {
				cuentaAlumno++;
			}
		}
		return cuentaAlumno;
	}
/*
 * 10  Escribe un método para la clase Punto que mueva las coordenadas a otro punto.
 */
	
	public static Punto nuevoPunto( int nuevoX, int nuevoY) {
		
		return new Punto(nuevoX,nuevoY);
	}
/*
 * 11. Escribe un método que reciba como parámetro dos objetos tipo Punto y regrese como
 *  resultado su pendiente.	
 */
	
	public static double puntoPendiente(Punto p1, Punto p2) {
		double pendiente=0;
	    pendiente = p2.getY()-p1.getY();
	    pendiente /=p2.getX()-p1.getX();
		return pendiente; 
	}
/*
 * 13.Escribe un método que reciba como parámetro un arreglo de Puntos y obtenga cuantos están en el origen (0,0)
 */
	public static int puntoOrigen(Punto[]puntos) {
		int origen=0;
		for(int i=0; i<puntos.length;i++) {
			if((puntos[i].getX()==0)&&(puntos[i].getY()==0)){
				origen++;
			}
		}
		return origen;
	}
/*
 * 14.Escribe un método que reciba como parámetro un entero entre 0 y 99 y obtenga el número de decenas que contiene.
 */
	public static int decenas(int numero) {
		int decena=0;
		if((numero==0)||(numero<=99)){
			 decena =numero/10;
		}
		return decena;
	}
/*
 * 15.Escribe un método que reciba como parámetro una cantidad en pesos y regrese como resultado la cantidad en dólares, el tipo de cambio es 20.17 pesos por dólar.	
 */
	public static double pesoDolar(double pesos) {
		double dolares=0;
		dolares = pesos*20.17;
		return dolares;
	}
/*
 * 16.Escribe un método que reciba como parámetro una cantidad en dólares y regrese como resultado la cantidad en pesos, el tipo de cambio es 20.17 pesos por dólar.	
 */
	public static double dolarPeso(double dolar) {
		double pesos=0;
		pesos = dolar/20.17;
		return pesos;
	}
/*
 * 17.Escribe un método que reciba un entero como parámetro y regrese un booleano indicando si el parámetro esta en el rango de 0 a 100.	
 */
	public static boolean rango(int numero) {
		boolean rango = false;
		if((numero==0)||(numero<=100)) {
			rango = true;
		}
		return rango;
	}
/*
 *18.-Escribe un método que reciba como parámetro un String y regrese un valor bolean indicando si el String es un palíndromo.	
 */
	public static boolean palindromo(String palabra) {
		boolean palindromo=false;
		char[]palindromos;
		int izq=0, der;
		palabra = palabra.toLowerCase();
		palabra = palabra.replace(" ", "");
		palindromos = palabra.toCharArray();
		der=palindromos.length-1;
	    while(izq<der) {
	    	if(palindromos[izq]==palindromos[der]) {
	    		der--;
	    		izq++;
	    	}else {
	    		 palindromo=false;
	    		break;
	    	}
	    	
	    }
	    if(izq==der) {
	    palindromo=true;
	    }
	    return palindromo;
	}
/*
 * 19.Escribe un método que reciba como parámetro un String y obtenga como resultado el número de palabras que contiene 
 * (las palabras están separadas por espacio).	
 */
	public static int numeroPalabras(String frase) {
		int cont = 1;
		int cont2 = 0;
		if (frase.isEmpty()) {
		System.out.println("No se ha introducido nada");
		cont = 0;
		}
		for (int i = 0; i < frase.length(); i++) {
		if(frase.charAt(i)==' '&&frase.charAt(i+1)==' '){
		cont2++;
		}
		if (frase.charAt(i) == ' ') {
		cont++;
		}
		}

		return cont-cont2;
		}
/*
 * 20. escribe un metodo que regrese un valor aleatorio entre 1 y 6
 */
	public static int  valorAleatorio() {
		Random aleatorio = new Random();
		int n = 1 + aleatorio.nextInt(6);
		return n;
	}
/*
 * 21. escribe un metodo que reciba un numero entero como parametro y regrese
 * como resultado un arreglo con todos sus divisores	


	public static int[] divisores(int entero) {
		int residuo =0;
		int contador=0;
		for(int i=1;i<=entero;i++) {
			residuo=entero%i;
			if(residuo==0) {
				contador++;
			}
		 }
		int divisor[] = new int [contador];
		for(int i=1;i<=entero;i++) {
			residuo=entero%i;
			if(residuo==0) {
				divisor[i]=(i);
			}
		 }
		return divisor;
		
			}

/*
 * 22.Escribe un método que reciba como parámetro dos arreglos de datos enteros y
obtenga como resultado un arreglo con la suma de los dos parámetros.	
 */
	public static int[] sumaArreglos(int[]arreglo, int[] arreglos) {
		int [] suma = new int [arreglo.length];
		for(int i=0; i<arreglo.length;i++) {
		suma[i] = arreglo[i]+arreglos[i];
		}
		return suma;
	}
	/*
	 * 24.Escribe un método que reciba como parámetro un arreglo de objetos tipo Libro y
     *  obtenga el número de libros de cada clasificación.
	 */
	public static int libroClasificacion(Libro []clasificacion) {
		int cont=0;
		for(int i=0; i<clasificacion.length;i++) {
			if(clasificacion[i].getClasifiacion()==8) {
				cont++;
		}
		}
		return cont;
	}
	public static String saludar(String nombre) {
		return "hola "+nombre;
		
	}
	public static String saludar() {
		return "hola extraño";
	}
	public static int multiplicar(int a,int b) {
		return a*b;
	}
	public static double multiplicar(double a, double b) {
		return a*b;
	}
//main
public static void main(String [] args) {
	//metodo 1
	System.out.println("metodo 1. String tecnologico, caracter c,"
			+ "resultado "+contarLetras("tecnologico",'c'));
	System.out.println("***************************************************");
	//metodo 2
	System.out.println("metodo 2. Cuantos digitos tiene 11bryant34 "+ " resultado "+contarDigitos("11bryant34"));
	System.out.println("***************************************************");
	//metodo 3
	System.out.println("metodo 3. ¿El numero 30 es numero par? "+numeroParImpar(30));
	System.out.println("***************************************************");
	//metodo 4
	System.out.println("metodo 4. ¿El numero 5 es primo?"+numeroPrimo(5));
	System.out.println("***************************************************");
	//metodo 5
	System.out.println("metodo 5. Regrese el numero en letras 0 al 100 "+numeroLetras(76));
	System.out.println("***************************************************");
	//metodo 6
	System.out.println("metodo 6. Lista de alumnos ");
	for(Alumno a: a) 
		System.out.println(a);
	System.out.println("***************************************************");
	System.out.println("metodo 7. Numero de mujeres en el grupo "+numeroMujeres(a));
	System.out.println("***************************************************");
	//metodo 8
	System.out.println("metodo 8. Promedio calificaciones "+promedioAlumno(a));
	System.out.println("***************************************************");
	//metodo 9
	System.out.println("metodo 9. Alumnos reprobados "+alumnosReprobados(a));
	System.out.println("***************************************************");
	//metodo 10
	System.out.println("metodo 10. Mueve las coordenadas a otro punto "+nuevoPunto(3,5));
	System.out.println("***************************************************");
	//metodo 11
	System.out.println("metodo 11. pendiente de dos puntos");
	Punto p1 = new Punto(3,2);
	Punto p2 = new Punto(7,8);
	System.out.println("x1,y1"+p1);
	System.out.println("x2,y2"+p2);
	System.out.println("La pendiente de dos objetos tipo Punto "+puntoPendiente(p1,p2));
	System.out.println("***************************************************");
	//metodo 13
	System.out.println("Puntos en el origen");
	Punto p5 = new Punto(0,0);
	Punto p4 = new Punto(0,0);
	Punto []p= {p1,p2,p5,p4};
	for(Punto mostrar: p)
		System.out.println(mostrar);
	System.out.println("metodo 13. Puntos que estan en el origen(0,0) "+puntoOrigen(p));
	System.out.println("***************************************************");
	//metodo 14
	System.out.println("metodo 14. Numero de decenas entre 0 y 99 en este caso 24 tiene "+decenas(24));
	System.out.println("***************************************************");
	//metodo 15
	System.out.println("metodo 15. Pesos a dolares 20.17 por dolar ejemplo 30 pesos es igual a "+pesoDolar(30)+" Dolares");
	System.out.println("***************************************************");
	//metodo 16
	System.out.println("metodo 16. Dolares a pesos 1 dolar es 20.17 por ejemplo 605.1 dolares a pesos es igual a "+dolarPeso(605.1)+" Pesos");
	System.out.println("***************************************************");
	//metodo 17
	System.out.println("metodo 17. Esta en rango el numero 99 "+rango(99));
	System.out.println("***************************************************");
	//metodo 18
	System.out.println("metodo 18. La palabra amor a roma es palindromo "+palindromo("amor a roma"));
	System.out.println("***************************************************");
	//metodo 19
	System.out.println("metodo 19. La frase estoy escribiendo un programa. tiene  "+numeroPalabras("estoy escribiendo un programa")+" palabras");
	System.out.println("***************************************************");
	//metodo 20
	System.out.println("metodo 20. valor aleatorio entre 1 y 6 :"+valorAleatorio());
	System.out.println("***************************************************");
	//metodo 21
	//metodo 22 
	int arreglo1[]= {5,8,9,2,3};
	int arreglo2[]= {7,9,2,6,4};
	System.out.println("metodo 22. suma de dos arreglos");
	System.out.println(Arrays.toString(arreglo1));
	System.out.println(Arrays.toString(arreglo2));
	System.out.println("la suma es \n"+Arrays.toString(sumaArreglos(arreglo1,arreglo2)));
	System.out.println("***************************************************");
	//metodo 24
	String titulo[]= {"Don quijote","Historia de dos ciudades","El señor de los anillos","El principito","El hobbit"}; 
	String autor[]={"Miguel Cervantes","Charles Dickens","J.R.R Tolkien","Antonie de Saint-Exupery","J.R.R. Tolkien"};
	String editorial[]= {"Tomas Gorchs","Alianza","Boocket","Salamandra","Minotauro"};
	int año[]= {1859,2015,2012,2001,2011};
	int clasificacion[]= {8,8,8,3,4};
	Libro libros[] = new Libro[titulo.length];
	for(int i=0; i<titulo.length;i++) {
		libros[i] = new Libro(titulo[i],autor[i],editorial[i],año[i],clasificacion[i]);
	}
	for(Libro l: libros)
		System.out.println(l);
	System.out.println("metodo 24 libros de cada clasificacion ejemplo clasifiacion 8 son "+libroClasificacion(libros)+" libros");
    System.out.println("multiplicar entero "+multiplicar(5,5));
    System.out.println("multiplicar tipo double "+multiplicar(5.5,5.5));
}
}