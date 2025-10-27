package tp4;

import java.util.List;

public class Caja {
	
	private List<Producto> stock;
	
	public Caja(List<Producto> stock) {
		this.stock = stock;
	}	

	public int precioTotal(Persona per) {
		
		int sumaTotal = 0 ;
		for (Producto p : per.getListaDeCompras()) {
			sumaTotal += p.getPrecio();			
		}
		return sumaTotal;
	}
	
	public void decrementar(Producto p) {
	    stock.remove(p);
	}
	
	public void agregarProducto(Producto p) {
		this.stock.add(p);
	}
	
	public List<Producto> getStock() {
		return stock;
	}	
}


