package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SupermercadoTest {
	
	List<Producto> catalogo = new ArrayList<Producto>();
	Producto p1 = new ProductoCuidado("Leche", 100, 0.11);
    Producto p2 = new Producto("Pan", 50);
    Producto p3 = new ProductoCuidado("Arroz", 80, 0.08);
    Supermercado sup = new Supermercado(catalogo,"chino","Calle 125");
	 
	@BeforeEach
    public void setUp() {
		catalogo.add(p1);
		catalogo.add(p2);
		catalogo.add(p3);
    }

	@Test
	void cantidadDeProductos() {
		assertEquals(3, sup.cantidadDeProductos());
	}
	
	@Test
	void sumaDeLosProductos() {
		assertEquals(212,sup.precioDeTodosLosProductos());
	}

}

