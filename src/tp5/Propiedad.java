package tp5;

public class Propiedad {
	
	private String descripcion;
	private double valorFiscal;
	private String dir;
	
	public Propiedad(String descripcion, double valorFiscal, String dir) {
		this.descripcion = descripcion;
		this.dir = dir; 
		this.valorFiscal = valorFiscal;
	}
	
	public double getValorFiscal() {
		return valorFiscal;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public String getDireccion() {
		return dir;
	}

}
