package Sample.Junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class sampletest {

	@Test
	public void testcasepass() {
		
		int a =1;
		int b = 2;
		assertTrue(a+b == 3);
	}
	
	@Test
	public void testcasefail() {
		
		int a =1;
		int b = 2;
		assertTrue(a+b == 4);
	}
}
