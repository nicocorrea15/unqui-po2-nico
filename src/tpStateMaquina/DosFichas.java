package tpStateMaquina;

public class DosFichas implements EstadoMaquinita {

    @Override
    public void ingresarFicha(Maquinita maquinita) {
    }

    @Override
    public void presionarBotonInicio(Maquinita maquinita) {
        maquinita.usarFicha(2);
        maquinita.setEstado(new Jugando());
    }

    @Override
    public void terminarJuego(Maquinita maquinita) {
    }
}
