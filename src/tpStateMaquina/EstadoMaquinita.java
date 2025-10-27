package tpStateMaquina;

public interface EstadoMaquinita {
	
    void ingresarFicha(Maquinita maquinita);
    void presionarBotonInicio(Maquinita maquinita);
    void terminarJuego(Maquinita maquinita);
}
