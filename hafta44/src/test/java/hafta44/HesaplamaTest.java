package hafta44;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testTopla39() {
		int gercekSonuc = Hesaplama.topla(25, 14);
		
		assertEquals(39, gercekSonuc);
		
	}
	@Test
	public void testTopla25ve14() {
		int gercekSonuc = Hesaplama.topla(25, 14);
		
		assertEquals(39, gercekSonuc);
		
	}

}
