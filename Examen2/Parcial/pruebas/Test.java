package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Raiz;


public class Test {
	private Raiz raiz;
	private int a;
	private int b;
	private int c;
	
	@BeforeEach
	public void setUp() {
		this.raiz = new Raiz();
	}
	
	@Test
	public void testRaiz1() throws Exception {
		assertEquals(5.0, this.raiz.raiz(3, 1, -2);
		assertThrows(Exception.class, () -> this.raiz.raiz(0, 1, 2));
		assertThrows(Exception.class, () -> this.raiz.raiz(5, 1, 2));
		
		

	

}
