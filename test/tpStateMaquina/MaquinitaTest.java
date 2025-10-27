package tpStateMaquina;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaquinitaTest {

    Maquinita maquinita;

    @BeforeEach
    void setUp() {
        maquinita = new Maquinita();
    }

    @Test
    void testUnJugador() {
        maquinita.ingresarFicha();
        assertTrue(maquinita.getEstado() instanceof UnaFicha);

        maquinita.presionarBotonInicio();
        assertTrue(maquinita.getEstado() instanceof Jugando);

        maquinita.terminarJuego();
        assertTrue(maquinita.getEstado() instanceof SinFicha);
    }

    @Test
    void testDosJugadores() {
        maquinita.ingresarFicha();
        maquinita.ingresarFicha();
        assertTrue(maquinita.getEstado() instanceof DosFichas);

        maquinita.presionarBotonInicio();
        assertTrue(maquinita.getEstado() instanceof Jugando);

        maquinita.terminarJuego();
        assertTrue(maquinita.getEstado() instanceof SinFicha);
    }

    @Test
    void testSinFichaPresionaInicio() {
        maquinita.presionarBotonInicio();
        assertTrue(maquinita.getEstado() instanceof SinFicha);
    }
}
