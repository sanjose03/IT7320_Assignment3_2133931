package IT7320.Assignment_3;

public class calcmultiply {

	calcinterface calc;
	public void setcalc(calcinterface calc)
	{
		this.calc = calc;
	}
	public int multiplyTwoNums(int a, int b)
	{
		return calc.multiply(a, b);
	}
	
}