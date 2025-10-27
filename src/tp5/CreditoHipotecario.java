package tp5;

public class CreditoHipotecario extends Credito{
	
	private Propiedad propiedad;
	
	
	public CreditoHipotecario(Cliente cliente, double montoSolicitado, int cantCuotas,Propiedad propiedad) {
		super(cliente, cantCuotas, montoSolicitado);
		this.propiedad = propiedad;
		
	}

	@Override
	public boolean esAceptable() {
		double valorPropiedad = propiedad.getValorFiscal();
		double sueldoMensualCliente = cliente.getSueldoMensual();
		int edadFinal = cliente.getEdad() + (cantCuotas / 12);
		double cuotaMensual = this.getCuotaMensual();
		
		
		return cuotaMensual <= sueldoMensualCliente * 0.5 &&
			   montoSolicitado <= valorPropiedad * 0.7 &&
			   edadFinal <= 65;
	}


}


