package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class RectanguloTestCase {
	
	Rectangulo r1,r2,r3,r;
	Cuadrado c ;
	
	@BeforeEach
	void setUp() {
		r1 = new Rectangulo(0, 0, 5, 3);
        r2 = new Rectangulo(0, 0, 3, 5);
        r3 = new Rectangulo(0, 0, 4, 4);
        r  = new Rectangulo(0, 0, 4, 6);
        c = new Cuadrado(1, 1, 5);
	}

    @Test
    void testRectanguloAreaPerimetro() {
        assertEquals(24, r.area(), "El área debería ser 24");
        assertEquals(20, r.perimetro(), "El perímetro debería ser 20");
    }
    
    @Test 
    void testRectanguloOrientacion() {
    	
    	 assertTrue(r1.esHorizontal());
    	 assertFalse(r1.esVertical());

    	 assertTrue(r2.esVertical());
    	 assertFalse(r2.esHorizontal());

    	 assertFalse(r3.esHorizontal());
    	 assertFalse(r3.esVertical());
    }
    
    @Test
    void testCuadrado() {
            assertEquals(25, c.area());
            assertEquals(20, c.perimetro());
            assertFalse(c.esHorizontal());
            assertFalse(c.esVertical());
            assertEquals(5, c.getLado());
    }
    
    @Test
    void testCuadradoSetLado() {
        c.setLado(7);
        assertEquals(7, c.getLado());
        assertEquals(7, c.getAncho());
        assertEquals(7, c.getAlto());
        
        assertThrows(IllegalArgumentException.class, () -> c.setLado(-2));
    }
}