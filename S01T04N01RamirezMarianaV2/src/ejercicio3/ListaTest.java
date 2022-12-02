package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaTest {

	@Test
	void indexFourShouldReturnArrayIndexOutOfBound() {
		int[] myNum = {10, 20, 30, 40};
		Lista lista1 = new Lista(myNum, 8);
		assertThrows(ArrayIndexOutOfBoundsException.class , ()->{
			lista1.AccedeLista(5);
		});
	}

}
