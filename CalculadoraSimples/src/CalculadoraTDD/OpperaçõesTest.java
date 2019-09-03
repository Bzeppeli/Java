package CalculadoraTDD;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calculadora.Opperações;
import static junit.framework.Assert.*;

class OpperaçõesTest {

	Opperações operações;
	
	@BeforeEach
	void setUp() throws Exception {
		operações = new Opperações();
	}

	@SuppressWarnings("deprecation")
	@Test
	void testSoma() {
		assertEquals(4, operações.soma(2, 2));
		assertEquals(7, operações.soma(4, 3));
	}

	@Test
	void testMuliplicação() {
		assertEquals(10, operações.muliplicação(2, 5));
		assertEquals(25, operações.muliplicação(5, 5));
		
	}
	
	

	@Test
	void testSubtração() {
		assertEquals(2, operações.subtração(5, 3));
		//assertEquals(-10, operações.subtração(1, -11));
	}
	
	/*
	@Test
	void testDivisão() {
		fail("Not yet implemented");
	}*/

}
