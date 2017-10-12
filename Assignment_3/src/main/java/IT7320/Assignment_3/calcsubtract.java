package IT7320.Assignment_3;

public class calcsubtract {

	calcinterface calc;
	public void setcalc(calcinterface calc)
	{
		this.calc = calc;
	}
	public int subtractTwoNums(int a, int b)
	{
		return calc.subtract(a, b);
	}
	
}