package ar.edu.unq.po2.tp3;

public class Punto {
	
	int x;
	int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	 
    public Punto(int nuevoX , int nuevoY) {
		 setX(nuevoX);
		 setY(nuevoY); 
	 }  
	 
    public Punto() {
    	this(0,0);
    }
    
    public Punto sumar(int n, int m) {
	        return new Punto(this.x + n, this.y + m);
	}
	 
}

