package IT7320.Assignment_3;

public class calcdoubledivide {

	calcinterface calc;
	public void setcalc(calcinterface calc)
	{
		this.calc = calc;
	}
	public int doubledivideTwoNums(int a, int b)
	{
		return calc.doubledivide(a, b);
	}
	
}