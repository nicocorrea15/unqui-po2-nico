package tp7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JugadorTest {
	
	Ingeniero ingeniero;
	Caballero caballero;
	Ejercito ejercito1;
	Ejercito ejercitoCompuesto;
		
	@BeforeEach 
	void setUp() {
		
		ingeniero = new Ingeniero(15);
		caballero = new Caballero();
		ejercito1 = new Ejercito();
		ejercitoCompuesto = new Ejercito();
		
	}
	
	@Test
	void avanzarAlDestino() {
		
		int origen = 1;
		int destino = 15;
		
		ingeniero.caminar(origen, destino);
		
		assertEquals(1, ingeniero.cantLajas());
		
	}
	
	@Test
	void avanzarEjercito() {
		
		int origen = 1;
		int destino = 15;
		
		ingeniero.setLajas(20);
		
		ejercitoCompuesto.agregarJugador(ejercito1);
		ejercitoCompuesto.agregarJugador(caballero);
		ejercitoCompuesto.agregarJugador(ingeniero);
		
		ejercitoCompuesto.caminar(origen, destino);
		
		assertEquals(6, ingeniero.cantLajas());
		
		
	}

}
