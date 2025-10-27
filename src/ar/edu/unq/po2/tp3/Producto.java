package ar.edu.unq.po2.tp3;

public class Producto {
	
	String nombre;
	int precioProducto;
	
	
	public Producto(String nombre, int precioProducto) {
        this.nombre = nombre;
        this.precioProducto = precioProducto;
    }
	
	public int precioConDescuento() {
        return precioProducto; 
    }
	 
	public String getNombre() {
        return nombre;
    }

    public int getPrecioBaseDelProducto() {
        return precioProducto;
    }

}