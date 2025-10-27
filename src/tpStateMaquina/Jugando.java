package tpStateMaquina;

public class Jugando implements EstadoMaquinita {

    @Override
    public void ingresarFicha(Maquinita maquinita) {
    }

    @Override
    public void presionarBotonInicio(Maquinita maquinita) {
    }

    @Override
    public void terminarJuego(Maquinita maquinita) {
        maquinita.setEstado(new SinFicha());
    }
}
