package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	Punto origen;
	int alto;
	int ancho;
	
	public Punto getOrigen() {return origen;}	public int getAlto() {return alto;}	public int getAncho() { return ancho;}
	public void setOrigen(Punto otroOrigen) {this.origen= otroOrigen;}
	public void setAncho(int x) {this.alto = x;}
	public void setAlto(int y) {this.ancho = y;}
	
	public Rectangulo(Punto punto,int x, int y) {
		if (x < 0 || y < 0) {
			throw new IllegalArgumentException("Ancho y alto deben ser positivos");
		}
		
		this.origen = punto;
		this.alto = y; 
		this.ancho = x;
	}
	
	public Rectangulo(int x, int y, int ancho, int alto) {
        this(new Punto(x, y), ancho, alto);
    }
	
	public int area() {
		return ancho * alto;
	}
	
	public int perimetro() {
		return 2 * (ancho + alto);
	}
	
	public boolean esHorizontal() {
        return ancho > alto;
    }

    public boolean esVertical() {
        return alto > ancho;
    }

}
