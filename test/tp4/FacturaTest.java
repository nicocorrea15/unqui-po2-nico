package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FacturaTest {
	
	Factura f = new Factura(100, 3, 50);
    
	@Test
	void test() {
		assertEquals(350, f.montoAPagar());
	}

	@Test
    void testImpuesto() {
        Factura f = new Factura(100, 3, 50);
        assertEquals(50, f.impuesto());
    }

}



