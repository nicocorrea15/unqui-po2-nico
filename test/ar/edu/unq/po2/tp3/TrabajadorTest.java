package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


   public class TrabajadorTest {
	   
	 Trabajador juan;
     Ingreso eneroSueldo;
	 IngresoHorasExtras eneroHE;
	 IngresoHorasExtras febreroHE;
	 Ingreso febreroIngreso;

	    @BeforeEach
	    public void setUp() {
	        juan = new Trabajador("Juan");

	        eneroSueldo = new Ingreso("Enero", "Sueldo", 50000);
	        febreroIngreso = new Ingreso("Febrero", "Sueldo", 20000);
	        eneroHE = new IngresoHorasExtras("Enero", "Horas Extras", 5000, 10);
	        febreroHE = new IngresoHorasExtras("Febrero", "Horas Extras", 5000, 5);

	        juan.agregarIngreso(eneroSueldo);
	        juan.agregarIngreso(febreroIngreso);
	        juan.agregarIngreso(eneroHE);
	        juan.agregarIngreso(febreroHE);
	    }
	 
	    @Test
	    public void testTotalPercibido() {
	    	
	     assertEquals(145000, juan.getTotalPercibido());
	    }
	    
	    @Test
	    public void testTotalImpuesto() {
	    	assertEquals(1400, juan.getImpuestoAPagar());
	    }
	    
	    @Test
	    public void testTotalImponible() {
	    	assertEquals(70000, juan.getMontoImponible());
	    }
	}

