package tpStateMaquina;

public class SinFicha implements EstadoMaquinita {

    @Override
    public void ingresarFicha(Maquinita maquinita) {
        maquinita.agregarFicha();
        maquinita.setEstado(new UnaFicha());
    }

    @Override
    public void presionarBotonInicio(Maquinita maquinita) {
    }

    @Override
    public void terminarJuego(Maquinita maquinita) {
    }
}
