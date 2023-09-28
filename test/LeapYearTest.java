package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.LeapYear;

class LeapYearTest {
	
	LeapYear leapYear;
	
	@BeforeEach
	public void inicializar() {
		leapYear = new LeapYear();
	}

	@Test
	void trueDiv4N100() {
		 assertTrue(leapYear.isLeapYear(2024));
	}
	
	@Test
	void trueDiv4Div400() {
		 assertTrue(leapYear.isLeapYear(2400));
	}
	
	@Test
	  public void falseDiv4Div100() {
		assertFalse(leapYear.isLeapYear(100));
	}
	
	@Test
	  public void falseN4Div100() {
		assertFalse(leapYear.isLeapYear(300));
	}
}
