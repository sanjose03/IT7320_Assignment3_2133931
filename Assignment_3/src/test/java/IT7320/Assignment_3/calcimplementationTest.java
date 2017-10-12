package IT7320.Assignment_3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class calcimplementationTest extends TestCase {

	calcimplementation obj;
	int a, b;
	protected void setUp() throws Exception{
		obj = new calcimplementation();
		a = 3;
		b = 5;
		calcinterface mockObj = mock(calcinterface.class);
		when(mockObj.add(a, b)).thenReturn(a + b);
		obj.setcalc(mockObj);
	}
	
	public void testAddTwoNums() {
		assertEquals(8, obj.addTwoNums(a, b));
	}
	
	protected void tearDown() throws Exception {
		obj = null;
		a = 0;
		b = 0;
	}
}
