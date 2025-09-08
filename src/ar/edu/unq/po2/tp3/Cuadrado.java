package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {

	public Cuadrado(Punto origen, int lado) {
		super(origen, lado, lado);
	}
	
	public Cuadrado(int x, int y, int lado) {
		super(x, y , lado ,lado );
	}
	
	public void setLado(int lado) {
        if (lado <= 0) throw new IllegalArgumentException("Lado debe ser positivo");
        setAncho(lado);
        setAlto(lado);
    }
	
	public int getLado() {
        return getAncho(); 
    }

}
