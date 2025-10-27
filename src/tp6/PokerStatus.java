package tp6;

import java.util.HashMap;
import java.util.Map;

public class PokerStatus {
	
	public String verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
        Carta[] cartas = {c1, c2, c3, c4, c5};
        Map<String, Integer> contadorNumeros = new HashMap<>();
        Map<String, Integer> contadorPalos = new HashMap<>();

        
        for (Carta carta : cartas) {
            String num = carta.getNumeracion();
            String palo = carta.getFigura();

            contadorNumeros.put(num, contadorNumeros.getOrDefault(num,0)+1);
            contadorPalos.put(palo, contadorPalos.getOrDefault(palo,0)+1);
        }

        
        if (contadorNumeros.containsValue(4)) {
            return "Poquer";
        }

        if (contadorPalos.containsValue(5)) {
            return "Color";
        }

        if (contadorNumeros.containsValue(3)) {
            return "Trio";
        }

        return "Nada";
    }
	
}
