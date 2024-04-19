package Unidad3;
/**
 * Tarea 7
 * Clase que usa Persona.java y su jerarquia
 * de contacto y alumno
 * @author bryanttrujillo
 *
 */
import java.util.Scanner;
public class UsaHerencia7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
	    String nombre[]={"bryant","jose","pedro","juan"};
	    String apellido[]= {"trujillo","lopez","garcia","alvarez"};
	    int edad[]= {20,19,21,30};
	    char sexo[]= {'H','H','H','H'};
		Contacto contacto[] = new Contacto[4];
		for(int i=0; i<contacto.length;i++) {
			contacto[i]=new Contacto(nombre[i],apellido[i],edad[i],sexo[i]);
		}
		boolean salir = false;
		String opcion;
		while (!salir) {
			System.out.println("a) listar telefonos de contactos");
			System.out.println("b) agrear un telefono");
			System.out.println("c) eleminar un telefono");
			System.out.println("d) finalizar el programa");
			
	
				System.out.println("Elige una de las opciones");
				opcion = entrada.next();
				
				switch (opcion) {
				case "a":
					for(int i=0; i<contacto.length;i++) {
						System.out.println(contacto[i]);
					}
					break;
				case "b":
					for(int i=0; i<contacto.length;i++) {
						System.out.println(contacto[i]);
					}
					String nombre1;
					String numero;
					String clave;
					char tipo;
					System.out.println("¿a quien quiere agregar telefono?");
					nombre1 = entrada.next();
					int contador=0;
					for(int i=0;i<contacto.length;i++) {
						if(nombre1.equalsIgnoreCase(contacto[i].getNombre())){
							System.out.println("ingresa tipo de telefono");
							tipo = entrada.next().charAt(0);
							{while(tipo!='f' && tipo!='m');
							do {
							System.out.println("ingresa la clave");
							clave = entrada.next();	
							}while(clave.length()!=2);
							do {
							System.out.println("ingresa el telefono");
							numero = entrada.next();	
							}while(numero.length()!=10);
							contacto[i].añadirTelefono(new Telefono(tipo,clave,numero));
							contador++;	
							}
						}
						}
						 if (contador==0) {
		                    System.out.println("no existe, intentalo de nuevo");
				}
					break;
					
				case "c":
					String contacto1;
					String numero1;
					for(int i=0; i<contacto.length;i++) {
						System.out.println(contacto[i]);
					}
					System.out.println("Ingresa el contacto que deseas eliminar el numero");
					contacto1 = entrada.next();
					System.out.println("ingresa el telefono a eliminar del contacto");
					numero1 = entrada.next();
					for(int i=0;i<contacto.length;i++) {
					  if(contacto1.equalsIgnoreCase(contacto[i].getNombre())) {
						contacto[i].eliminarTelefono(numero1);
					     }
				    }
					break;
					
				case "h":
					salir = true;
					break;	
					default:
						System.out.println("Solo letras entre a y d");
				
			}
		}
		System.out.println("Fin del programa");
	
	}
	
	}

