package tp6;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerTest {

    private PokerStatus pokerStatus;

    @BeforeEach
    void setUp() {
        pokerStatus = new PokerStatus();
    }

    @Test
    void testPoquer() {
       
        Carta c1 = mock(Carta.class);
        Carta c2 = mock(Carta.class);
        Carta c3 = mock(Carta.class);
        Carta c4 = mock(Carta.class);
        Carta c5 = mock(Carta.class);
        
        when(c1.getNumeracion()).thenReturn("2");
        when(c2.getNumeracion()).thenReturn("2");
        when(c3.getNumeracion()).thenReturn("2");
        when(c4.getNumeracion()).thenReturn("2");
        when(c5.getNumeracion()).thenReturn("3");

        when(c1.getFigura()).thenReturn("P");
        when(c2.getFigura()).thenReturn("C");
        when(c3.getFigura()).thenReturn("D");
        when(c4.getFigura()).thenReturn("T");
        when(c5.getFigura()).thenReturn("P");

        String resultado = pokerStatus.verificar(c1, c2, c3, c4, c5);
        assertEquals("Poquer", resultado);
    }
    
    @Test 
    void testTrio() {
    	Carta c1 = mock(Carta.class);
        Carta c2 = mock(Carta.class);
        Carta c3 = mock(Carta.class);
        Carta c4 = mock(Carta.class);
        Carta c5 = mock(Carta.class);
        
        when(c1.getNumeracion()).thenReturn("2");
        when(c2.getNumeracion()).thenReturn("2");
        when(c3.getNumeracion()).thenReturn("2");
        when(c4.getNumeracion()).thenReturn("3");
        when(c5.getNumeracion()).thenReturn("3");

        when(c1.getFigura()).thenReturn("P");
        when(c2.getFigura()).thenReturn("C");
        when(c3.getFigura()).thenReturn("D");
        when(c4.getFigura()).thenReturn("T");
        when(c5.getFigura()).thenReturn("P");

        String resultado = pokerStatus.verificar(c1, c2, c3, c4, c5);
        assertEquals("Trio", resultado);
    }
    
    @Test 
    void testColor() {
    	Carta c1 = mock(Carta.class);
        Carta c2 = mock(Carta.class);
        Carta c3 = mock(Carta.class);
        Carta c4 = mock(Carta.class);
        Carta c5 = mock(Carta.class);
        
        when(c1.getNumeracion()).thenReturn("2");
        when(c2.getNumeracion()).thenReturn("2");
        when(c3.getNumeracion()).thenReturn("4");
        when(c4.getNumeracion()).thenReturn("3");
        when(c5.getNumeracion()).thenReturn("3");

        when(c1.getFigura()).thenReturn("P");
        when(c2.getFigura()).thenReturn("P");
        when(c3.getFigura()).thenReturn("P");
        when(c4.getFigura()).thenReturn("P");
        when(c5.getFigura()).thenReturn("P");

        String resultado = pokerStatus.verificar(c1, c2, c3, c4, c5);
        assertEquals("Color", resultado);
    }
    
    @Test 
    void testNada() {
    	Carta c1 = mock(Carta.class);
        Carta c2 = mock(Carta.class);
        Carta c3 = mock(Carta.class);
        Carta c4 = mock(Carta.class);
        Carta c5 = mock(Carta.class);
        
        when(c1.getNumeracion()).thenReturn("2");
        when(c2.getNumeracion()).thenReturn("5");
        when(c3.getNumeracion()).thenReturn("2");
        when(c4.getNumeracion()).thenReturn("3");
        when(c5.getNumeracion()).thenReturn("3");

        when(c1.getFigura()).thenReturn("P");
        when(c2.getFigura()).thenReturn("C");
        when(c3.getFigura()).thenReturn("D");
        when(c4.getFigura()).thenReturn("T");
        when(c5.getFigura()).thenReturn("P");

        String resultado = pokerStatus.verificar(c1, c2, c3, c4, c5);
        assertEquals("Nada", resultado);
    }
}
