package ar.edu.unq.po2.tp3;

public class IngresoHorasExtras extends Ingreso{
	
    int horasExtras;
	
	public IngresoHorasExtras(String mes, String concepto, int monto,int horasExtras) {
		super(mes, concepto, monto);
		this.horasExtras = horasExtras;
	}

	@Override
	public int montoImponible() {
		return 0;
	}
	
	@Override
	public int getMonto() {
        return monto * horasExtras;
    }

}
