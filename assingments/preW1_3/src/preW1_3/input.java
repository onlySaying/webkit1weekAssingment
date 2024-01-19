package preW1_3;

import java.util.Scanner;

public class input {
	Scanner scan = new Scanner(System.in);
	public int inputMoney()
	{
		int temp = scan.nextInt();
		return temp;
	}
	
	public int buyingJuice()
	{
		int choice = 0;
		choice = scan.nextInt();
		return choice;
	}
}
