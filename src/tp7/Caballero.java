package tp7;

public class Caballero implements Jugador {
	
	@Override
	public void caminar(int origen, int destino) {
		
		while(origen < destino) {
			verificarSiHayEnemigos();
			origen++;
		}
	}
	
	public void verificarSiHayEnemigos() {
		
	}

}
