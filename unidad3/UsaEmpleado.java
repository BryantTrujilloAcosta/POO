package Unidad3;
/**
 * 
 * Clase que usa la clase Empleado y 
 * sus clases derivadas
 * @author bryanttrujillo
 *
 */
import java.util.ArrayList;
public class UsaEmpleado {

	public static void main(String[] args) {
		String[] nombresComision = {"pedro", "Mayra"};
		String[] apellidoComision= {"rodriguez","perez"};
        int[] edadComision = {24, 54};
        char[] sexoComision = {'M', 'F'};
        String[] oficioComision = {"gerente", "vendedor"};
        String[] identificacionComision = {"ABP815", "A432DD"};
        double[] porcentajeComision ={2,5};
        int [] ventasComision = {61,20};
        double[] pagaVentasComision = {200.5, 55.7};
        ArrayList <EmpComision> comision = new ArrayList<>();
        
        System.out.println("SUELDO POR COMISIÓN");
        for (int i = 0; i < nombresComision.length; i++) {
            EmpComision objeto1 = new EmpComision(nombresComision[i],apellidoComision[i],edadComision[i],sexoComision[i],oficioComision[i],identificacionComision[i],porcentajeComision[i],ventasComision[i],pagaVentasComision[i]);
            comision.add(objeto1);
            
        }
        for (int i = 0; i < comision.size(); i++) {
            System.out.println(comision.get(i).toString() + " ,\t comisión total = " + comision.get(i).sueldo());
        }
      
        String[] nombresHoras = {"Karla", "Ana"};
        String[] apellidoHoras = {"Garza","Hernandez"};
        int[] edadHoras = {12, 15};
        char[] sexoHoras = {'F', 'F'};
        String[] oficioHoras = {"Recepcionista", "Dentista"};
        String[] identificacionHoras = {"PPU145", "OIR645"};
        int[] horasHoras = {26, 10};
        double[] tarifaHoras = {24, 50};
        ArrayList <EmpleadoHora> horas = new ArrayList<>();

        System.out.println("");
        System.out.println("SUELDO POR HORAS");        
        for (int i = 0; i < nombresHoras.length; i++) {
            EmpleadoHora objeto2 = new EmpleadoHora(nombresHoras[i],apellidoHoras[i],edadHoras[i],sexoHoras[i],oficioHoras[i],identificacionHoras[i],horasHoras[i],tarifaHoras[i]);
            horas.add(objeto2);
        }
        
    
        for (int i = 0; i < comision.size(); i++) {
            System.out.println(horas.get(i).toString() + " ,\t paga por horas total = " + horas.get(i).sueldo());
        }
        
        String[] nombresBase = {"Lupita", "Jose"};
        String[] apellidoBase = {"martinez","sanchez"};
        int[] edadBase = {30, 50};
        char[] sexoBase = {'F', 'M'};
        String[] oficioBase = {"Limpieza", "Conserje"};
        String[] identificacionBase = {"UUAF87", "GBJ76"};
        double[] precioBase = {2800, 2000};
        ArrayList <EmpleadoBase> base = new ArrayList<>();
        
        System.out.println("");
        System.out.println("SUELDO BASE");        
        for (int i = 0; i < nombresBase.length; i++) {
            EmpleadoBase objeto3 = new EmpleadoBase(nombresBase[i],apellidoBase[i],edadBase[i],sexoBase[i],oficioBase[i],identificacionBase[i],precioBase[i]);
            base.add(objeto3);
        } 
        
        for (int i = 0; i < base.size(); i++) {
            System.out.println(base.get(i).toString() + " ,\t paga por sueldo base total = " + base.get(i).sueldo());
        }
		

	}

}
