package proW1_1;

public class operating {
	public int calc(int a, int b, char c)
	{
		int ans = 0;
		
		if(c == '+') ans = plus(a,b);
		if(c == '-') ans = minus(a,b);
		if(c == '*') ans = multiply(a,b);
		if(c == '/') ans = division(a,b);
		return ans;
	}
	
	public int plus(int a, int b){return a+b;}
	public int minus(int a, int b) {return a-b;}
	public int multiply(int a, int b) {return a*b;}
	public int division(int a, int b) {return a/b;}
}
