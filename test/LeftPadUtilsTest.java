package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import main.LeftPadUtils;

class LeftPadUtilsTest {

	@Test
	void testBasico() {
		assertEquals("--abc",LeftPadUtils.leftPad("abc", 5, "-"));
	}
	
	@Test
	void padStrNullVazio() {
		assertEquals("  abc",LeftPadUtils.leftPad("abc", 5, null));
		assertEquals("  abc",LeftPadUtils.leftPad("abc", 5, ""));
	}
	
	@Test
	void strNullVazio() {
		assertEquals(null,LeftPadUtils.leftPad(null, 5, null));
		assertEquals("     ",LeftPadUtils.leftPad("", 5, ""));
	}
	
	@Test
	void sizeZero() {
		assertEquals("abc",LeftPadUtils.leftPad("abc", 0, "-"));		
	}
	
	@Test
	void sizeMenorStr() {
		assertEquals("abc",LeftPadUtils.leftPad("abc", 2, "cc"));		
	}
	
	@Test
	void sizeIgualStrEPadStrNull() {
		assertEquals("abc",LeftPadUtils.leftPad("abc", 3, null));		
	}	
	
	
	@Test
	void sizeIgualStrEPadStrMaior1() {
		assertEquals("abc",LeftPadUtils.leftPad("abc", 3, "cc"));		
	}
	
	@Test
	void sizeMaiorStrEPadStrNull() {
		assertEquals("  abc",LeftPadUtils.leftPad("abc", 5, null));		
	}
	
	@Test
	void sizeMaiorStrEPadStrIgual1() {
		assertEquals("ccabc",LeftPadUtils.leftPad("abc", 5, "c"));		
	}
	
	@Test
	void sizeMaiorStrEPadStrMaior1() {
		assertEquals("cdabc",LeftPadUtils.leftPad("abc", 5, "cd"));		
	}
	
	@Test
	void sizeMaiorStrEPadStrMaior1EsizeMenorStrMaisPadstr() {
		assertEquals("cdabc",LeftPadUtils.leftPad("abc", 5, "cde"));		
	}
	
	@Test
	void sizeMaiorStrEPadStrMaior1EsizeMaiorStrMaisPadstr() {
		assertEquals("cdecdabc",LeftPadUtils.leftPad("abc", 8, "cde"));		
	}
	
	@Test
	void sizeNegativo() {
		assertEquals("abc",LeftPadUtils.leftPad("abc", -5, "cde"));		
	}
	
}
