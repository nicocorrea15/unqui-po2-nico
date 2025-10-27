package tp7;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParcelaTest {
	
	Cultivo c1;
	Cultivo c2;
	Cultivo c3;
	
	Parcela parcela1;
	ParcelaCompuesta parcela2;
	
	List<Parcela> parcelas ;
	
	
	@BeforeEach
	void setUp() {
		
		c1 = new Soja();
		c2 = new Trigo();
		c3 = new Soja();
		parcela1 = new ParcelaSimple(c1) ;
		parcela2 = new ParcelaCompuesta();
		
		
	}
	
	@Test 
	public void parcelaSimple() {
	
		assertEquals(500, parcela1.gananciaSoja()  ); 
	}
	
	@Test 
	public void parcelaCompuesta() {
		
		parcela2.agregarSubparcela(parcela1);
		parcela2.agregarSubparcela(new ParcelaSimple(c2));
		parcela2.agregarSubparcela(new ParcelaSimple(c3));
	
		assertEquals(1000, parcela2.gananciaSoja()  ); 
	}
}
