package proW1_1;

public class calculate {

	
	public static void main(String[] args) 
	{
		char cal = ' ';
		input ip = new input();
		output op = new output();
		operating operate = new operating();
		while(cal != 'q')
		{	
			//input first num for calc
			op.inputNum(1);
			int a = ip.inputNum();
			
			//input calc for calculation but if it have exit, cal will be 'q'
			op.inputCalc();
			cal = ip.inputCalc();
			if(cal == 'q') {continue;}
			
			//input second num for calc
			op.inputNum(2);
			int b = ip.inputNum();
			
			System.out.println(operate.calc(a, b, cal));
		}
	}

}
