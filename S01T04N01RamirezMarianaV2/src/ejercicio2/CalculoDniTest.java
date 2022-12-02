package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculoDniTest {

	@Test
	void DniCorrecto() {
		CalculoDni Dni1 = new CalculoDni("60032484T");
		assertEquals(true, Dni1.validaDni());
	}
	
	@Test
	void letraCorrectaT() {
		Integer numero = 60032484;
		assertEquals("T", CalculoDni.letraDni(numero));
	}

	@Test
	void letraCorrectaR() {
		Integer numero = 60032485;
		assertEquals("R", CalculoDni.letraDni(numero));
	}
	@Test
	void letraCorrectaW() {
		Integer numero = 60032486;
		assertEquals("W", CalculoDni.letraDni(numero));
	}
	
	@Test
	void letraCorrectaA() {
		Integer numero = 60032487;
		assertEquals("A", CalculoDni.letraDni(numero));
	}
	
	@Test
	void letraCorrectaG() {
		Integer numero = 60032488;
		assertEquals("G", CalculoDni.letraDni(numero));
	}
	
	@Test
	void letraCorrectaM() {
		Integer numero = 60032489;
		assertEquals("M", CalculoDni.letraDni(numero));
	}
	
	@Test
	void letraCorrectaY() {
		Integer numero = 60032490;
		assertEquals("Y", CalculoDni.letraDni(numero));
	}

}
