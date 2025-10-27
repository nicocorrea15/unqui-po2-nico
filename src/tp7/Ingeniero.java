package tp7;


public class Ingeniero implements Jugador {
	
	private int lajasDisponibles;
	
	public Ingeniero(int lajasIniciales) {
        this.lajasDisponibles = lajasIniciales;
    }
	
	@Override
	public void caminar(int origen, int destino) {
		
		while(origen < destino) {
			dejarLata();
			origen++;
		}
	}
	
	public void setLajas(int cantidad) {
		lajasDisponibles = cantidad;
	}
	
	public void dejarLata() {
		if (lajasDisponibles > 0)
		lajasDisponibles--;
    }
	
	public int cantLajas() {
		return lajasDisponibles;
	}
}