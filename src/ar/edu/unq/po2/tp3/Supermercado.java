package ar.edu.unq.po2.tp3;

import java.util.List;


public class Supermercado {
	
	private String nombre;
    private String direccion;
    private List<Producto> catalogo;
    
    public Supermercado(List<Producto> catalogo, String nombre, String direccion) {
    	this.catalogo = catalogo;
    	this.nombre = nombre;
    	this.direccion = direccion;
    }
    
    
    public int cantidadDeProductos() {
    	return catalogo.size();
    }
    
    public int precioDeTodosLosProductos() {
        int suma = 0;
        for (Producto p : catalogo) {
            suma += p.precioConDescuento();
        }
        return suma;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Producto> getCatalogo() {
        return catalogo;
    }

}

