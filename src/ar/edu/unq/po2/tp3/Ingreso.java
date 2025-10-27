package ar.edu.unq.po2.tp3;

public class Ingreso {
	
	String mes;
	int monto;
	String concepto;
	
	public Ingreso(String mes, String concepto, int monto) {
        this.mes = mes;
        this.concepto = concepto;
        this.monto = monto;
    }
	
	public int montoImponible() {
		return monto;
	}
	
	public int getMonto() {
        return monto;
    }

    public String getMes() {
        return mes;
    }

    public String getConcepto() {
        return concepto;
    }
}

