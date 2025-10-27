package tp5;

public abstract class Credito {
	
	protected Cliente cliente;
	protected int cantCuotas; 
	protected double montoSolicitado;
	
	public Credito(Cliente cliente, int cantCuotas, double montoSolicitado) {
		this.cliente = cliente;  
		this.cantCuotas = cantCuotas; 
		this.montoSolicitado = montoSolicitado;
	}
		
	public abstract boolean esAceptable();
	
	public double getMontoSolicitado() {
		return montoSolicitado;
	}
	
	public int getCuotasMensuales() {
		return cantCuotas;
	}
	
	
	 public double getCuotaMensual() {
	        return montoSolicitado / cantCuotas;
	    }

}
