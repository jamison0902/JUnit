package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import main.ChocolateBars;

class ChocolateBarsTest {
	
	public static final ChocolateBars chocolateBars = new ChocolateBars();

	@Test
	void semBar5() {		 
		 assertEquals(2,chocolateBars.calculate(5, 5, 2));
	}
	
	@Test
	void semBar1() {		 
		 assertEquals(0,chocolateBars.calculate(5, 5, 10));
	}
	
	@Test
	void mesmaQuantBar() {		 
		 assertEquals(2,chocolateBars.calculate(5, 5, 12));
	}
	
	@Test
	void bar1DobroBar5() {		 
		 assertEquals(2,chocolateBars.calculate(5, 5, 7));
	}
	
	@Test
	void bar5DobroBar2() {		 
		 assertEquals(2,chocolateBars.calculate(5, 5, 22));
	}
	
	@Test
	void TestandoZeroTotal() {		 
		 assertEquals(0,chocolateBars.calculate(5, 5, 0));
	}
	
	@Test
	void TestandoNegativo() {		 
		 assertEquals(-2,chocolateBars.calculate(5, 5, -12));
	}
	
	@Test
	void TestandoZeroBar5() {		 
		 assertEquals(4,chocolateBars.calculate(5, 0, 4));
	}
	
	@Test
	void TestandoZeroBar1() {		 
		 assertEquals(-1,chocolateBars.calculate(0, 5, 5));
	}
	
	@Test
	void TestandoBarrasInsuficientes() {		 
		 assertEquals(-1,chocolateBars.calculate(4, 5, 29));
	}
}
