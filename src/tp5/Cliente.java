package tp5;

public class Cliente {
	
	String nombre;
	String apellido;
	int edad;
	String direccion;
	double sueldoMensual;

	  public Cliente(String nombre, String apellido, int edad, String direccion, double sueldoMensual) {
		  this.nombre = nombre;
		  this.apellido = apellido;
		  this.edad = edad;
		  this.direccion = direccion;
		  this.sueldoMensual = sueldoMensual;    	  
     }
	  
	 public String getNombre() {return nombre;}
	 
	 public String getApellido() { return apellido; }
	 
	 public int getEdad() {return edad;}
	 
	 public String getDireccion() {return direccion;}
	 
	 public double getSueldoMensual() { return sueldoMensual; }
	 
	 public double getSueldoAnual() { return sueldoMensual * 12; }
	 
	 public void crecer() {
		 edad = edad + 1;
	 }
	  
	 public String getNombreCompleto() {
	        return nombre + " " + apellido;
	 }

}
