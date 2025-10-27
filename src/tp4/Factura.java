package tp4;

public class Factura {

	private int costoPorUnidadConsumida; 
	private int cantidadDeUnidadesConsumidas;
	private int tasaDelServicio;
	
	public void setCostoPorUnidadConsumida(int costo) { this.costoPorUnidadConsumida = costo; }
	public void setCantidadDeUnidadesConsumidas(int cantidad) { this.cantidadDeUnidadesConsumidas = cantidad; }
	public void setTasaDelServicio(int tasa) { this.tasaDelServicio = tasa; }
	
    public int getCosto() { return costoPorUnidadConsumida; }
    public int getCantidad() { return cantidadDeUnidadesConsumidas; }
    public int getTasa() { return tasaDelServicio; }
    
	public Factura(int costo, int cantidad, int tasa) {
		costoPorUnidadConsumida = costo;
		cantidadDeUnidadesConsumidas = cantidad;
		tasaDelServicio = tasa;
	}
	
	public int montoAPagar() {
		return costoPorUnidadConsumida * cantidadDeUnidadesConsumidas + impuesto();
	}
	
	public int impuesto() {
		return tasaDelServicio;
	}
}
