package preW1_3;

public class main {

	public static void main(String[] args) {
		bendingMachine bm = new bendingMachine();
		int choice = 0;
		int inputMoney;
		output op = new output();
		op.inputMoney();
		input ip = new input();
		inputMoney = ip.inputMoney();
		while(inputMoney >= bm.min && choice != -1)
		{
			op.buyingJuice();
			choice = ip.buyingJuice();
			inputMoney = bm.buying(choice, inputMoney);
		}
		bm.buyNums();
	}

}
