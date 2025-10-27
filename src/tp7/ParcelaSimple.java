package tp7;

public class ParcelaSimple implements Parcela {
    
	private Cultivo cultivo; // 

    public ParcelaSimple(Cultivo cultivo) {
        this.cultivo = cultivo;
    }

    @Override
    public double gananciaSoja() {
    	if (cultivo instanceof Soja) {
        	return cultivo.ganancia();
        }
        return 0;
    }

    @Override
    public double gananciaTrigo() {
        if (cultivo instanceof Trigo) {
        	return cultivo.ganancia();
        }
        return 0;
    }
    
    public Cultivo getCultivo() {
    	return cultivo;
    }
}

