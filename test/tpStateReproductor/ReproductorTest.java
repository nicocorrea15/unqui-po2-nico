package tpStateReproductor;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReproductorTest {

    private Reproductor reproductor;
    private Song song;

    @BeforeEach
    public void setUp() {
        song = new Song();
        reproductor = new Reproductor(song);
    }

    @Test
    public void testPlayDesdeSeleccionEmpiezaReproduccion() {
        reproductor.play();
        assertTrue(reproductor.getEstado() instanceof EstadoReproduciendo);
    }

    @Test
    public void testPlayDesdeReproduciendoDaError() {
        reproductor.play(); 
        reproductor.play(); 
        assertTrue(reproductor.getEstado() instanceof EstadoReproduciendo);
    }

    @Test
    public void testPauseDesdeReproduciendoPausa() {
        reproductor.play(); 
        reproductor.pause(); 
        assertTrue(reproductor.getEstado() instanceof EstadoPausado);
    }

    @Test
    public void testPauseDesdePausadoDaError() {
        reproductor.play();
        reproductor.pause();
        reproductor.pause(); 
        assertTrue(reproductor.getEstado() instanceof EstadoPausado);
    }

    @Test
    public void testPlayDesdePausadoReanudaReproduccion() {
        reproductor.play();
        reproductor.pause();
        reproductor.play();
        assertTrue(reproductor.getEstado() instanceof EstadoReproduciendo);
    }

    @Test
    public void testStopDesdeReproduciendoVuelveASeleccion() {
        reproductor.play();
        reproductor.stop();
        assertTrue(reproductor.getEstado() instanceof EstadoSeleccion);
    }

    @Test
    public void testStopDesdePausadoVuelveASeleccion() {
        reproductor.play();
        reproductor.pause();
        reproductor.stop();
        assertTrue(reproductor.getEstado() instanceof EstadoSeleccion);
    }
}
