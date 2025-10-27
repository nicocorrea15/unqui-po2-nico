package tpStateReproductor;

public class Reproductor {

    private EstadoReproductor estadoActual;
    private Song cancionActual;

    public Reproductor(Song cancion) {
        this.cancionActual = cancion;
        this.estadoActual = new EstadoSeleccion();
    }

    public void cambiarEstado(EstadoReproductor nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public void play() {
        estadoActual.play(this);
    }

    public void pause() {
        estadoActual.pause(this);
    }

    public void stop() {
        estadoActual.stop(this);
    }

    public Song getCancionActual() {
        return cancionActual;
    }
    
    public EstadoReproductor getEstado() {
    	return estadoActual;
    }
}
