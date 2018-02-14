package Sample.Junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class sampletest {

	
	@Test
	public void sampletest() {
		
		int a =1;
		int b = 2;
		assertTrue(a+b == 3);
	}
}
