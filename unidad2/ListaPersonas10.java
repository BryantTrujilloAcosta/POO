package unidad2;
/*
 * Equipo: Bryant Trujillo Acosta
 * Fecha: 18/febrero/2022
 * Programa para usar la clase Persona10.java
 * creando una lista de objetos de tipo persona 
 * usa ArraysList para almacenar los objetos y 
 * llenando los datos por medio del teclado
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ListaPersonas10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//declaro 
		String nombre = "";
		char sexo=0;
		int edad=0;
		//creo la lista de personas
		ArrayList<Persona10> lista = new ArrayList<Persona10>();
		//ingreso los datos con ayuda del bucle for
		for(int i=0; i<=10;i++){
			System.out.println("Ingresa el nombre de la persona "+i);
			nombre = entrada.next();
			System.out.println("ingresa el sexo");
			sexo = entrada.next().charAt(0);
			System.out.println("ingresa la edad");
			edad = entrada.nextInt();
			Persona10 p = new Persona10(nombre,sexo,edad);
			lista.add(p);
		}
		//imprime la lista
		for(Persona10 l: lista)
			System.out.println(l);
		//total de mujeres 
		int cuentaMujer=0;
		for(int i=0;i<lista.size();i++) {
			if((lista.get(i).getSexo()=='f')|| (lista.get(i).getSexo()=='F')) {
			cuentaMujer++;
			}
		}
		System.out.println("Total de mujeres: "+cuentaMujer);
		//total de adultos
		int cuentaAdulto=0;
		for(int i=0; i<lista.size();i++) {
			if(lista.get(i).getEdad()>=18) {
				cuentaAdulto++;
			}
		}
		System.out.println("Total de adultos: "+cuentaAdulto);
		//promedio de edades
		int suma=0;
		for(int i=0; i<lista.size();i++) {
			suma+=lista.get(i).getEdad();
		}
		System.out.println("El promedio de edades es: "+(float)suma/lista.size());
		//persona mas joven
		int menor=0;
		for(int i=0; i<lista.size();i++) {
			if(i==0) {  //decimos que el primer elemento es el numero menor
				menor = lista.get(i).getEdad();
				nombre = lista.get(i).getNombre();
			}else if(lista.get(i).getEdad()<menor){//lo comparamos con los demas
				menor = lista.get(i).getEdad();
				nombre = lista.get(i).getNombre();
			}
		}
		System.out.println("Persona mas joven: "+nombre);
		//total de adultos mayores(de 60 o mas años)
		int cuentaMayores=0;
		for(int i=0; i<lista.size();i++) {
			if(lista.get(i).getEdad()>=60) {
				cuentaMayores++;
			}
		}
		System.out.println("Total de adultos mayores: "+cuentaMayores);
	}

}
