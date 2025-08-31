package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {

    private Counter counter;

    @BeforeEach
    public void setUp() {
        counter = new Counter();
        counter.addNumber(1);
        counter.addNumber(2);
        counter.addNumber(3);
        counter.addNumber(4);
        counter.addNumber(5);
        counter.addNumber(6);
    }

    @Test
    public void testCountEven() {
        assertEquals(3, counter.contarPares()); // 2,4,6 son pares
    }

    @Test
    public void testCountOdd() {
        assertEquals(3, counter.contarImpares()); // 1,3,5 son impares
    }

    @Test
    public void testCountMultiplesOf3() {
        assertEquals(2, counter.contarMultiplos(3)); // 3 y 6 son múltiplos de 3
    }

    @Test
    public void testCountMultiplesOf5() {
        assertEquals(1, counter.contarMultiplos(5)); // 5 es múltiplo de 5
    }
}

