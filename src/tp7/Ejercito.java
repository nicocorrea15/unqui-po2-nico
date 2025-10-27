package tp7;

import java.util.ArrayList;
import java.util.List;

public class Ejercito implements Jugador{
	
	private List<Jugador> miembros = new ArrayList<>();
	
	public void agregarJugador(Jugador j) {
		miembros.add(j);
	}
	
	@Override
	public void caminar(int origen, int destino) {
		for (Jugador j : miembros) {
            j.caminar(origen, destino);
        }
	}
}
