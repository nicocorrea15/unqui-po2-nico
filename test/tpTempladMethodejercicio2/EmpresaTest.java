package tpTempladMethodejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpresaTest {
	
	Empresa empresa;
	Empleado empleado1;
	Empleado empleado2;
	Empleado empleado3;
	
	@BeforeEach
	void setUp() {
		
		empleado1 = new EmpleadoTemporario(10);
		empleado2 = new EmpleadoPasante(10);
		empleado3 = new EmpleadoDePlanta(2);
		empresa = new Empresa();
	}
	
	@Test
	void pagarEmpleados() {
		
		empresa.agregarEmpleado(empleado1);
		empresa.agregarEmpleado(empleado2);
		empresa.agregarEmpleado(empleado3);
		
		assertEquals(3, empresa.cantEmpleados());
	}
	
	@Test
	void sueldoDeEmpleados() {
		
		assertEquals(1050, empleado1.sueldo());
		assertEquals(400, empleado2.sueldo());
		assertEquals(3300, empleado3.sueldo());
	
	}
	
	@Test
	void sueldoFinalEmpleados() {
		
		assertEquals(913,5, empleado1.sueldoFinal());
		assertEquals(348, empleado2.sueldoFinal());
		assertEquals(2871, empleado3.sueldoFinal());
	}
	
	@Test 
	void totalAPagar() {
		
		empresa.agregarEmpleado(empleado1);
		empresa.agregarEmpleado(empleado2);
		empresa.agregarEmpleado(empleado3);
		
		
		assertEquals(4133, empresa.cantAPagar());
		
	}

}
