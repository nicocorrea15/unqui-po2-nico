package tpObserver;

import java.util.ArrayList;
import java.util.List;

public class ResultadosDePartidosApp {
	
	List<EncuentroDeportivo> partidos; 
	
	public List<String> resultados() {
		List<String> resultados = new ArrayList<>();
		
		for (EncuentroDeportivo partido : partidos) {
			resultados.add(partido.getResultado());
		}
		return resultados;
	}
	
	public void addPartido(EncuentroDeportivo e) {
		partidos.add(e);
	}

}
