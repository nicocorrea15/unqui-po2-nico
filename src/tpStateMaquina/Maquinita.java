package tpStateMaquina;

public class Maquinita {
    
    private EstadoMaquinita estadoActual;
    private int fichas;

    public Maquinita() {
        this.estadoActual = new SinFicha();
        this.fichas = 0;
    }

    public void setEstado(EstadoMaquinita nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public EstadoMaquinita getEstado() {
        return estadoActual;
    }

    public int getFichas() {
        return fichas;
    }

    public void agregarFicha() {
        fichas++;
    }

    public void usarFicha(int cantidad) {
        fichas -= cantidad;
    }

    public void ingresarFicha() {
        estadoActual.ingresarFicha(this);
    }

    public void presionarBotonInicio() {
        estadoActual.presionarBotonInicio(this);
    }

    public void terminarJuego() {
        estadoActual.terminarJuego(this);
    }
}
