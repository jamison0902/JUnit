package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import main.ChocolateBars;

class ChocolateBarsTest2 {

	public static final ChocolateBars chocolateBars = new ChocolateBars();

	@Test
	void semBar5() {		 
		 assertEquals(3,chocolateBars.calculate(4, 2, 3));
	}
	
	@Test
	void semBar1() {		 
		 assertEquals(0,chocolateBars.calculate(5, 3, 10));
	}
	
	@Test
	void bar1AndBar5() {		 
		 assertEquals(2,chocolateBars.calculate(5, 3, 17));
	}
	
	@Test
	void barInsuficiente() {		 
		 assertEquals(-1,chocolateBars.calculate(1, 1, 10));
	}
	
	@Test
	void numeroNegativo() {		 
		 assertEquals(-1,chocolateBars.calculate(-1,-1,-1));
	}

}
