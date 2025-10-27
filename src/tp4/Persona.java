package tp4;

import java.util.List;

public class Persona {
	
	List<Producto> miLista;
	String nombre;
	int edad;
	
	public int getEdad() {
		return edad;
	}
	
	public String geteNombre() {
		return nombre;
	}
	
	public Persona(String nombre, List<Producto> misProductos) {
		this.miLista = misProductos;
		this.nombre = nombre;
	}

	public void agregarACarrito(Producto p,Caja caja) {
		this.miLista.add(p);
		caja.decrementar(p);
	}
	
	public List<Producto> getListaDeCompras() {
		return miLista;
	}
}
