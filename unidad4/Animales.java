package unidad4;
/**
 * Tarea 8 
 * Clase Animales 
 * clase padre de Pato.java, Abeja.java, Ballena.java, Murcielago.java
 * atributo especie 
 * @author bryanttrujillo
 * 15 may. 2022 22:00:44
 *
 */
public class Animales {
		private String especie;
		public Animales (String especie) {
			this.especie = especie;
		}
		public String getEspecie() {
			return especie;
		}
		public String toString() {
			return "Animal"+especie;
		}
		public boolean equals(Object o) {
			boolean res = false;
			if(o instanceof Animales) {
				Animales a = (Animales)o;
				res=(especie==a.especie);
			}
			return res;
		}

	}
