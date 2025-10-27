package tpStateMaquina;

public class UnaFicha implements EstadoMaquinita {

    @Override
    public void ingresarFicha(Maquinita maquinita) {
        maquinita.agregarFicha();
        maquinita.setEstado(new DosFichas());
    }

    @Override
    public void presionarBotonInicio(Maquinita maquinita) {
        maquinita.usarFicha(1);
        maquinita.setEstado(new Jugando());
    }

    @Override
    public void terminarJuego(Maquinita maquinita) {
    }
}
