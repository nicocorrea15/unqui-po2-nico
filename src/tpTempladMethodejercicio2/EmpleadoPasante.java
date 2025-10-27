package tpTempladMethodejercicio2;

public class EmpleadoPasante extends Empleado {
	
	int horasTrabajadas;
	
	public EmpleadoPasante(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public int sueldo() {
		return 40 * horasTrabajadas;
	}
	
	public void carga() {}

}
