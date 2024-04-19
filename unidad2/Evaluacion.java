/*
* AUTOR: BRYANT TRUJILLO ACOSTA 
* FECHA: 31 DE ENERO DEL 2022
* PROPOSITO: ELABORA UN PROGRAMA EN JAVA QUE DECLARE UN ARREGLO 5X5(FILAS Y COLUMNAS Y AGREGUE
* ALEATORIAMENTE (RANDOM) VALORES 0 O 1 EN CADA ELEMENTO DEL ARREGLO. OBTEN EL TOTAL DE CADA COLUMNA, EL TOTAL
* DE CADA FILA Y EL TOTAL DE LAS DIAGONALES.
* IMPRIME EN PATALLA LOS DATOS DEL ARREGLO(FILAS Y COLUMNAS) Y LOS TOTALES.
*/
package unidad2;
import java.util.Random;
public class Evaluacion {
	// MATRIZ PRINCIPAL
    public static int [][] matriz = new int [5][5];
	
	public static void main(String[] args) {
		System.out.println("La Matriz es:\n");
		inicializar(matriz);
		imprimir(matriz);
		sumaFila(matriz);
		sumaColumna(matriz);
		diagonal(matriz);
		diagonalInvertida(matriz);

	}
	//INICIALIZA LA MATRIZ
	public static void inicializar (int [][]matriz){
		Random r = new Random();
		for (int i=0; i< matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(2);
			}
		}
		
	}
	//IMPRIME LA MATRIZ
	public static void imprimir (int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				
				System.out.print(matriz[i][j]+ "  ");
			}
			System.out.println();
		}
	}
	// SUMA DE FILA
    public static void sumaFila (int [][] matriz) {
			int fila;
			for (int i=0; i<matriz.length; i++ ) {
				fila = 0;
				for (int j=0; j<matriz[i].length; j++) {
					fila += matriz[i][j]; 
				}
				System.out.print("\nTotal fila "+i+" = "+fila);
			}
			System.out.println("");
  }
    //SUMA DE COLUMNA
    public static void sumaColumna (int [][] matriz) {
    	int columna;
    	for (int j=0; j<matriz[0].length; j++) {
    		columna =0;
    		for (int i=0; i<matriz.length; i++) {
    			columna +=matriz[i][j];
    		}
    		System.out.print("\nTotal columna "+j+" = "+columna);
    	}
    	System.out.println("");
    }
    //SUMA DE LA DIAGONAL
    public static void diagonal (int [][]matriz) {
    	int diagonal =0;
		for (int i=0; i<matriz.length; i++) {
			 for (int j=0; j<matriz[i].length; j++) {
				if (i==j) {
					diagonal += matriz[i][j];
				}
			}
		}
			System.out.print("\nTotal diagonal = "+diagonal);
    		
    	}
    //SUMA DE LA DIAGONAL INVERTIDA
    public static void diagonalInvertida(int [][]matriz) {
    	int diagonal =0;
    	for (int i = 0; i<matriz.length; i++ ) {
			for (int j=0; j<matriz[i].length; j++) {
				if (i+j == (matriz.length -1)) {
					diagonal += matriz[i][j];
				}
			}
		}
		System.out.print("\nTotal diagonal invertida = "+diagonal);
			}
    }
    

