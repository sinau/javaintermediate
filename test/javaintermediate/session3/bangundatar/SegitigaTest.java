package javaintermediate.session3.bangundatar;

import static org.junit.Assert.*;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

public class SegitigaTest {

	@Test
	public void hitungLuas() {
		Segitiga segitiga = new Segitiga();
		segitiga.setAlas(7);
		segitiga.setTinggi(5);
		
		assertEquals("17.5", segitiga.hitungLuas() + StringUtils.EMPTY);
		
		segitiga.setAlas(3);
		segitiga.setTinggi(5);
		
		assertEquals("7.5", segitiga.hitungLuas() + StringUtils.EMPTY);
		
		segitiga.setAlas(4);
		segitiga.setTinggi(5);
		
		assertEquals("10.0", segitiga.hitungLuas() + StringUtils.EMPTY);
		
		segitiga.setAlas(8);
		segitiga.setTinggi(4);
		
		assertEquals("16.0", segitiga.hitungLuas() + StringUtils.EMPTY);
	}
	
}
