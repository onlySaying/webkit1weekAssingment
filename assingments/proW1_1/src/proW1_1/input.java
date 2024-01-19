package proW1_1;

import java.util.Scanner;

public class input {

	Scanner scan = new Scanner(System.in);
	
	//피연산자는 2개 입력받도록 하고, 숫자가 50이 넘으면 다시 작성할 수 있도록 한다.
	int inputNum()
	{
		int num = 0;
		boolean first = false;
		do
		{	
			if(first) System.out.println("다시 입력하세요.");
			num = scan.nextInt();
			first = true;
		}while((num > 50));
		
		return num;
	}
	
	char inputCalc()
	{
		char calc = ' ';
		
		calc = scan.next().charAt(0);
		
		return calc;
	}
}
