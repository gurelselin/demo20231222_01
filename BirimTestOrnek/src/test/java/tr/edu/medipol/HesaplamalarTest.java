package tr.edu.medipol;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamalarTest {

	@Test
	public void testFaktoriyelRec() {
		int sonuc = Hesaplamalar.faktoriyelRec(5);
		assertEquals(120, sonuc);
	}
	
	@Test
	public void testFaktoriyelLoop() {
		int sonuc = Hesaplamalar.faktoriyelLoop(5);
		assertEquals(120, sonuc);
	}

	@Test
	 public void testFaktoriyel() {
		for(int i=1; i<1000; i++) {
		int sonuc1= Hesaplamalar.faktoriyelLoop(i);
		int sonuc2= Hesaplamalar.faktoriyelRec(i);
		assertEquals(sonuc1,sonuc2);
				
		}
	
	}
	
	@Test
	public void testTopla() {
		int sonuc = Hesaplamalar.topla(17, 5);
		assertEquals(22, sonuc);
	}
	
	@Test
	public void testCikart() {
		int sonuc = Hesaplamalar.cikart(17, 5);
		assertEquals(12, sonuc);
	} 
	
	@Test
	public void testCarp() {
		int sonuc = Hesaplamalar.carp(17, 5);
		assertEquals(85, sonuc);
	}
	
	@Test
	public void testTopla2ve2() {
		assertEquals(4, Hesaplamalar.topla(2, 2));
	}
	
	
}
