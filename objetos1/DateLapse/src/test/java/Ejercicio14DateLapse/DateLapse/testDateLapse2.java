package Ejercicio14DateLapse.DateLapse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testDateLapse2 {

	
private Lapse date;
	
	@BeforeEach
	public void setUp() {
		date = new DateLapseVersion2(LocalDate.of(2023, 10, 1),5);
	}
	
	@Test
	public void testSizeInDays() {
		assertEquals(30,date.sizeInDays());
	}
	
	@Test
	public void testIncludesDate() {
		LocalDate otherInto = LocalDate.of(2023, 10,1 );
		LocalDate otherInto2 = LocalDate.of(2023, 10,15 );
		LocalDate otherInto3 = LocalDate.of(2023, 10,31 );
		assertTrue(date.includesDate(otherInto));
		assertTrue(date.includesDate(otherInto2));
		assertTrue(date.includesDate(otherInto3));
		
	}
	@Test
	public void testIncludesDateOut() {
		LocalDate otherOut = LocalDate.of(2023, 9,30 );
		LocalDate otherOut2 = LocalDate.of(2023, 11,1 );
		assertFalse(date.includesDate(otherOut));
		assertFalse(date.includesDate(otherOut2));
		
	}
	
}
