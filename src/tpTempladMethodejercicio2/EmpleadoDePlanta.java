package tpTempladMethodejercicio2;

public class EmpleadoDePlanta extends Empleado {
	
	int sueldoBasico = 3000;
	int cantHijos;
	
	public EmpleadoDePlanta(int cantHijos) {
		this.cantHijos = cantHijos;
	}
	
	public int sueldo() {
		return sueldoBasico + cantHijos * 150;
	}
	
	public void carga() {}

}