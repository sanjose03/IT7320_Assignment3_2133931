package IT7320.Assignment_3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class calcsubtractTest extends TestCase {

	calcsubtract obj;
	int a, b;
	protected void setUp() throws Exception{
		obj = new calcsubtract();
		a = 3;
		b = 5;
		calcinterface mockObj = mock(calcinterface.class);
		when(mockObj.subtract(a, b)).thenReturn(a - b);
		obj.setcalc(mockObj);
	}
	
	public void testsubtractTwoNums() {
		assertEquals(-2, obj.subtractTwoNums(a, b));
	}
	
	protected void tearDown() throws Exception {
		obj = null;
		a = 0;
		b = 0;
	}
}

