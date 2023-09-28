package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.RomanNumeral;

class RomanNumeralTest {

RomanNumeral romanNum;
	
	@BeforeEach
	public void inicializar() {
		romanNum = new RomanNumeral();
	}
	
	@Test
	public void umaLetra() {
		Assertions.assertEquals(5, romanNum.convert("V"));
	}
	
	@Test
	public void ordemDecresecente() {
		Assertions.assertEquals(11, romanNum.convert("XI"));	
	}
	
	@Test
	public void ordemCrescente() {
		Assertions.assertEquals(900, romanNum.convert("CM"));	
	}
	
	@Test
	public void mesmaLetra() {
		Assertions.assertEquals(2, romanNum.convert("II"));	
	}

	@Test
	public void tresLetrasIguais() {
		Assertions.assertEquals(3, romanNum.convert("III"));	
	}
	
	@Test
	public void tresLetrasDecrescente() {
		Assertions.assertEquals(16, romanNum.convert("XVI"));	
	}
	
	@Test
	public void tresLetrasCrescente() {
		Assertions.assertEquals(14, romanNum.convert("XIV"));	
	}
	
	@Test
	public void quatroLetra() {
		Assertions.assertEquals(94, romanNum.convert("XCIV"));	
	}
	
	@Test
	public void cincoLetras() {
		Assertions.assertEquals(81, romanNum.convert("LXXXI"));	
	}
	
	@Test
	public void seisLetras() {
		Assertions.assertEquals(84, romanNum.convert("LXXXIV"));	
	}
	
	@Test
	public void seteLetras() {
		Assertions.assertEquals(87, romanNum.convert("LXXXVII"));	
	}
	
	@Test
	public void oitoLetras() {
		Assertions.assertEquals(88, romanNum.convert("LXXXVIII"));	
	}

}
