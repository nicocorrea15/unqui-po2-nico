package tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CajaTest {
	
	
	List<Producto> stock = new ArrayList<Producto>();
	
	Persona nico = new Persona("nico" , new ArrayList<Producto>());
	Caja caja = new Caja(stock);
	Producto p1 = new Producto("manzana", 50);
	Producto p2 = new ProductoDeCooperativa("banana", 200);
	Producto p3 = new Producto("mandarina", 150);
	
	@BeforeEach
	void setUp() {
		caja.agregarProducto(p1);
		caja.agregarProducto(p2);
		caja.agregarProducto(p2);
		caja.agregarProducto(p3);
		caja.agregarProducto(p3);
		nico.agregarACarrito(p1,caja);
		nico.agregarACarrito(p2,caja);
		nico.agregarACarrito(p3,caja);
		
	}

	@Test
	void registrarProductos() {
		
		assertEquals(3, nico.miLista.size());
			
	}
	
	@Test 
	void precioTotalDeProductos() {
		assertEquals(380,caja.precioTotal(nico) );
	}
	
	@Test
	void decrementar() {
		assertEquals(2, caja.getStock().size());
	}

}
