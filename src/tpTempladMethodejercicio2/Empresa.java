package tpTempladMethodejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	List<Empleado> empleados;
	
	public Empresa() { 
		empleados = new ArrayList<>();
	}
	
	public void agregarEmpleado(Empleado e) {
		empleados.add(e);
	}
	
	public void pagarSueldo() {
		
		for (Empleado e : empleados) {
			e.sueldoFinal();			
		}
	}
	
	public void carga() {
		for (Empleado e : empleados) {
			
			e.carga();
		}
	}
	
	public int cantAPagar() {
		
		int sumaTotal = 0;
		
		for (Empleado e : empleados) {
			sumaTotal += e.sueldoFinal();
		}
		return sumaTotal;
	}
	
	public int cantEmpleados() {
		return empleados.size();
	}

}
