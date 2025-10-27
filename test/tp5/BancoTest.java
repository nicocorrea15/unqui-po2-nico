package tp5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class BancoTest {

	List<Cliente> clientes = new ArrayList<Cliente>();
    List<Credito> creditos = new ArrayList<Credito>();
    
    Banco macro = new Banco(clientes, creditos);

    Cliente nico = new Cliente("nico", "correa", 25, "803", 1500);
    Cliente jose = new Cliente("jose", "tejedi", 65, "siempreviva", 2000);
    Cliente rana = new Cliente("rana", "marihuana", 55, "sprinfield", 500.50);
    Cliente sapo = new Cliente("sapo", "pepe", 41, "roque saenz peña", 3500);
    
    Credito expres = new CreditoPersonal(nico, 12 , 12500);
    
    
    @BeforeEach
    void setUp() {
       	
    }
    
    @Test
    void agregarCliente() {
    	macro.agregarCliente(nico);
    	assertTrue(macro.getClientes().contains(nico));
    }
    

    @Test
    void cantidadClientes() {
    	macro.agregarCliente(nico);
    	macro.agregarCliente(jose);
    	macro.agregarCliente(rana);
    	macro.agregarCliente(sapo);
        assertEquals(4,macro.cantClientes());
    }
    
    @Test
    void crecer() {
    	assertEquals(41, sapo.getEdad());
    	sapo.crecer();
    	assertEquals(42,sapo.getEdad());
    	sapo.crecer();
    	assertEquals(43,sapo.getEdad());
    }
    
    @Test
    void agregarCredito() {
    	macro.registrarCredito(expres);
    	assertTrue(macro.getCreditos().contains(expres));
    }
    
    @Test
    void creditoAprobado() {
    	assertTrue(macro.evaluarSolicitud(expres));
    }
    
    
}

