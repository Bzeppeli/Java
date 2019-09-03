package CalculadoraTDD;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calculadora.Oppera��es;
import static junit.framework.Assert.*;

class Oppera��esTest {

	Oppera��es opera��es;
	
	@BeforeEach
	void setUp() throws Exception {
		opera��es = new Oppera��es();
	}

	@SuppressWarnings("deprecation")
	@Test
	void testSoma() {
		assertEquals(4, opera��es.soma(2, 2));
		assertEquals(7, opera��es.soma(4, 3));
	}

	@Test
	void testMuliplica��o() {
		assertEquals(10, opera��es.muliplica��o(2, 5));
		assertEquals(25, opera��es.muliplica��o(5, 5));
		
	}
	
	

	@Test
	void testSubtra��o() {
		assertEquals(2, opera��es.subtra��o(5, 3));
		//assertEquals(-10, opera��es.subtra��o(1, -11));
	}
	
	/*
	@Test
	void testDivis�o() {
		fail("Not yet implemented");
	}*/

}
