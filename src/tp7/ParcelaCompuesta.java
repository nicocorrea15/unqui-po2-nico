package tp7;

import java.util.ArrayList;
import java.util.List;

public class ParcelaCompuesta implements Parcela {
    
	private List<Parcela> subparcelas;
	
	public ParcelaCompuesta() {
		this.subparcelas = new ArrayList<>();
	}

    public void agregarSubparcela(Parcela p) {
        subparcelas.add(p);
    }

    public void eliminarSubparcela(Parcela p) {
        subparcelas.remove(p);
    }

    @Override
    public double gananciaSoja() {
        double total = 0;
        for (Parcela p : subparcelas) {
            total += p.gananciaSoja(); 
        }
        return total;
    }

    @Override
    public double gananciaTrigo() {
        double total = 0;
        for (Parcela p : subparcelas) {
            total += p.gananciaTrigo(); 
        }
        return total;
    }
}
