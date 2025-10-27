package tpStateReproductor;

public class EstadoPausado implements EstadoReproductor {

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
        r.getCancionActual().stop();
        r.cambiarEstado(new EstadoSeleccion());
    }
}
