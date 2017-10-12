package IT7320.Assignment_3;

public class calcimplementation {

	calcinterface calc;
	public void setcalc(calcinterface calc)
	{
		this.calc = calc;
	}
	public int addTwoNums(int a, int b)
	{
		return calc.add(a, b);
	}
	
}
