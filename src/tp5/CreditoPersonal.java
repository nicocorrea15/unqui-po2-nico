package tp5;

public class CreditoPersonal extends Credito{
	
	public CreditoPersonal(Cliente cliente, int cantCuotas, double montoSolicitado) {
		super(cliente, cantCuotas, montoSolicitado);
	}


	@Override
	public boolean esAceptable() {
		double sueldoAnualCliente = cliente.getSueldoAnual();
		double sueldoMensualCliente = cliente.getSueldoMensual();
		double cuotaMensual = this.getCuotaMensual();
		
		return sueldoAnualCliente >= 15000 && cuotaMensual <= sueldoMensualCliente * 0.7;
	}

}


