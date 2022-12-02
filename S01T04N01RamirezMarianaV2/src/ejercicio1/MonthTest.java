package ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonthTest {

	@Test
	void sizeMonthTwelve() {
		var month = new Month();
		int numeroMes = month.Month().size();
		assertEquals(12, numeroMes);
		
	}
	
	@Test
	void eightpositionIsAgoust() {
		var meses = new Month();
		assertEquals("Agosto", meses.Month().get(7));
		
	}
	
	@Test
	void nullList() {
		assertNotNull(Month.Month());	
	}

}
