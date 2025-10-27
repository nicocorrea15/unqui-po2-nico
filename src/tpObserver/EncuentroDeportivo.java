package tpObserver;

import java.util.ArrayList;
import java.util.List;

public class EncuentroDeportivo {
     
	String resultado; 
	List<String> contrincantes;
	Deporte deporte;
	
	public EncuentroDeportivo(String resultado, List<String> contrincantes, Deporte deporte) {
		this.resultado = resultado;
		this.contrincantes = new ArrayList<>();
		this.deporte = deporte;
	}
	
	public String getResultado() {
		return resultado;
	}
	
	public List<String> getContrincantes() {
		return contrincantes;
	}
	
	public Deporte getDeporte() {
		return deporte;
	}
	
	
	
}
