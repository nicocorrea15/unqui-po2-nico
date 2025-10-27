package tpStateReproductor;

public class EstadoReproduciendo implements EstadoReproductor {

    @Override
    public void play(Reproductor r) {
    }

    @Override
    public void pause(Reproductor r) {
        r.getCancionActual().pause();
        r.cambiarEstado(new EstadoPausado());
    }

    @Override
    public void stop(Reproductor r) {
        r.getCancionActual().stop();
        r.cambiarEstado(new EstadoSeleccion());
    }
}
