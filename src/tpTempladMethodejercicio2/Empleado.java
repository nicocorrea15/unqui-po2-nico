package tpTempladMethodejercicio2;

    public abstract class Empleado {
	 
	  protected abstract int sueldo();
	  protected abstract void carga();
	  
	  public int descuento() {
			return (int) (this.sueldo() * 0.13);
	  }
	  
	  public int sueldoFinal() {
		 return this.sueldo() - this.descuento();
	  }
	  
}
