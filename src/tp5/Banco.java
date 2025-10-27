package tp5;

import java.util.List;

public class Banco {
	
	private List<Cliente> clientes; 
	private List<Credito> creditos;
	
	public Banco(List<Cliente> clientes, List<Credito> creditos) {
		 this.clientes = clientes;
	     this.creditos = creditos;
		   	  
    }
	
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void registrarCredito(Credito credito) {
		creditos.add(credito);
	}
	
	public int cantClientes() {
		return clientes.size();
	}
	
	public double montoTotalSolicitudesAceptadas() {
        double total = 0;
        for (Credito credito : creditos) {
            if (credito.esAceptable()) {
                total += credito.getMontoSolicitado();
            }
        }
        return total;
    }
 
     public boolean evaluarSolicitud(Credito credito) {
         return credito.esAceptable();
     }
		     
     public List<Credito> getCreditos() {
         return creditos;
     }
     
     public List<Cliente> getClientes() {
         return clientes;
     }
		      

	
	
	
	

}
