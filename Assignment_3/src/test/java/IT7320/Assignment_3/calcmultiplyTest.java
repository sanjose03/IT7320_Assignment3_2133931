package IT7320.Assignment_3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class calcmultiplyTest extends TestCase {

	calcmultiply obj;
	int a, b;
	protected void setUp() throws Exception{
		obj = new calcmultiply();
		a = 3;
		b = 5;
		calcinterface mockObj = mock(calcinterface.class);
		when(mockObj.multiply(a, b)).thenReturn(a * b);
		obj.setcalc(mockObj);
	}
	
	public void testMultiplyTwoNums() {
		assertEquals(15, obj.multiplyTwoNums(a, b));
	}
	
	protected void tearDown() throws Exception {
		obj = null;
		a = 0;
		b = 0;
	}
}

