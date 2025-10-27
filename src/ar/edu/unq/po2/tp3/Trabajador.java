package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	List<Ingreso> ingresos;
    String nombre;
	
	public Trabajador(String nombre) {
        this.ingresos = new ArrayList<>();
    }
	
	public int getImpuestoAPagar() {
		return (int) (getMontoImponible() * 0.02);
	}
	
	public void agregarIngreso(Ingreso ingreso) {
        ingresos.add(ingreso);
    }
	
	public int getTotalPercibido() {	
		int sueldoAnual = 0;
		for (Ingreso i : ingresos) {
		    sueldoAnual += i.getMonto();
		}
		return sueldoAnual;
	}
	
	public int getMontoImponible() {
		 int cantidad = 0;
		 for (Ingreso i : ingresos) {
			 cantidad += i.montoImponible();
		 }
		 return cantidad;	 
	}

}