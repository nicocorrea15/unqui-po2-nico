package tp4;

public class ProductoDeCooperativa extends Producto {

	public ProductoDeCooperativa(String nombre,int precio) {
		super(nombre,precio);
	}
	
	@Override
	public int getPrecio() {
		return precio - this.descuento();
	}
	  
	public int descuento() {
		return (int) (precio * 0.1);
	}

}
