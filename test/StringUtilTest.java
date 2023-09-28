package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.StringUtil;

class StringUtilTest {
	
	@Test
	void strNull() {		
		Assertions.assertArrayEquals(null,StringUtil.substringsBetween(null, "a", "b"));
	}	
	
	@Test
	void strEmpty() {		
		Assertions.assertArrayEquals(new String[] {},StringUtil.substringsBetween("", "a", "b"));
	}

	@Test
	void openNull() {		
		Assertions.assertArrayEquals(null,StringUtil.substringsBetween("jamison", null, "s"));
	}
	
	@Test
	void openEmpty() {		
		Assertions.assertArrayEquals(null,StringUtil.substringsBetween("aaab", "", "b"));
	}
	
	
	@Test
	void closeNull() {		
		Assertions.assertArrayEquals(null,StringUtil.substringsBetween("aaab", "a", null));
	}
	
	@Test
	void closeEmpty() {		
		Assertions.assertArrayEquals(null,StringUtil.substringsBetween("aaabaab", "a", ""));
	}
	
	@Test
	void oneStrOpen() {		
		Assertions.assertArrayEquals(null,StringUtil.substringsBetween("a", "a", "u"));
	}
	
	@Test
	void oneStrClose() {		
		Assertions.assertArrayEquals(null,StringUtil.substringsBetween("d", "z", "d"));
	}
	
	@Test
	void oneStrMesmoOpenEClose() {		
		Assertions.assertArrayEquals(null,StringUtil.substringsBetween("d", "d", "d"));
	}
	
	@Test
	void StrNullOpenNullClose() {		
		Assertions.assertArrayEquals(null,StringUtil.substringsBetween("abcdef", "x", "y"));
	}
	
		
	
	@Test
	void StrOpenEmptyClose() {		
		Assertions.assertArrayEquals(null,StringUtil.substringsBetween("abcdef","b","y"));
	}
	
	@Test
	void StrEmptyOpenClose() {		
		Assertions.assertArrayEquals(null,StringUtil.substringsBetween("abcdef","x","b"));
	}
	
	@Test
	void StrOpenClose() {		
		Assertions.assertArrayEquals(new String[] {"bc"},StringUtil.substringsBetween("abcdef","a","d"));
	}
	
	
	@Test
	void StrManyOpenClose() {		
		Assertions.assertArrayEquals(new String[] {"bc","brf","hhh"},StringUtil.substringsBetween("abcdefabrfdahhhd","a","d"));
	}
	
	@Test
	void StrEmptyOpenEmptyClose2() {		
		Assertions.assertArrayEquals(null,StringUtil.substringsBetween("abcdef","hy","yu"));
	}
	
	
	@Test
	void StrOpenEmptyClose2() {		
		Assertions.assertArrayEquals(null,StringUtil.substringsBetween("abcdef","bc",""));
	}
	
	@Test
	void StrEmptyOpenClose2() {		
		Assertions.assertArrayEquals(null,StringUtil.substringsBetween("abcdef","","bc"));
	}
	
	@Test
	void StrOpenClose2() {		
		Assertions.assertArrayEquals(new String[] {"c"},StringUtil.substringsBetween("abcdef","ab","de"));
	}
	
	
	@Test
	void StrManyOpenClose2() {		
		Assertions.assertArrayEquals(new String[] {"c","rfda"},StringUtil.substringsBetween("abcdefabrfdadehhhd","ab","de"));
	}
	
	@Test
	void StrSemStrOpenClose() {		
		Assertions.assertArrayEquals(new String[] {""},StringUtil.substringsBetween("abcd","ab","cd"));
	}
	
		
	
	
}
