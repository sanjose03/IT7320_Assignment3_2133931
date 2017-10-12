package IT7320.Assignment_3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class calcdoubledivideTest extends TestCase {

	calcdoubledivide obj;
	int a, b;
	protected void setUp() throws Exception{
		obj = new calcdoubledivide();
		a = 3;
		b = 5;
		calcinterface mockObj = mock(calcinterface.class);
		when(mockObj.doubledivide(a, b)).thenReturn(a / b);
		obj.setcalc(mockObj);
	}
	
	public void testdoubledivideTwoNums() {
		assertEquals(0.6, obj.doubledivideTwoNums(a, b));
	}
	
	protected void tearDown() throws Exception {
		obj = null;
		a = 0;
		b = 0;
	}
}

