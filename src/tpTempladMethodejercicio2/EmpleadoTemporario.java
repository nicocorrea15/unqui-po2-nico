package tpTempladMethodejercicio2;

public class EmpleadoTemporario extends Empleado {
	
	int horasTrabajadas;
	int sueldoBasico = 1000;
	
	public EmpleadoTemporario(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	@Override
	public int sueldo() {
		if (tieneHijos() || estaCasado()) {
			return sueldoBasico + 5 * horasTrabajadas + 100;
		}
		return sueldoBasico + 5 * horasTrabajadas;
	}
	
	public boolean estaCasado() {
		return false;
	}
	
	
	public boolean tieneHijos() {
		return false;
	}
	
	public void carga() {}
}