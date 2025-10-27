package tpStateReproductor;

public class EstadoSeleccion implements EstadoReproductor {

    @Override
    public void play(Reproductor r) {
        r.getCancionActual().play();
        r.cambiarEstado(new EstadoReproduciendo());
    }

    @Override
    public void pause(Reproductor r) {
    }

    @Override
    public void stop(Reproductor r) {
    }
}
