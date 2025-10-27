package ar.edu.unq.po2.tp3;

public class ProductoCuidado extends Producto {
	
	private double valorDescuento;

	public ProductoCuidado(String nombre, int precioProducto, double valorDescuento) {
		super(nombre, precioProducto);
		this.valorDescuento = valorDescuento;
	}
	
	@Override
	public int precioConDescuento() {
            return (int) (this.precioProducto * (1 - valorDescuento));
        
    }
}
