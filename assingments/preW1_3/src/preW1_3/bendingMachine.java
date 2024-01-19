package preW1_3;

public class bendingMachine {

	public String[] juice;
	public int [] price = new int[3];
	public int min;
	public int [] buyNum ;
	output op = new output();
	public bendingMachine()
	{
		juice = new String[]{"커피", "우유", "주스"};
		price = new int[] {300, 400, 500};
		min = price[0];
		buyNum = new int[] {0,0,0};
		for(int i = 0; i < juice.length; i++)
		{
			System.out.print(juice[i] + " : " + price[i]);
			if(min > price[i])
			{
				min = price[i];
			}
			if(i != juice.length -1) {System.out.print(", ");}
		}
		System.out.println();
	}
	public int buying(int i , int money)
	{
		i -=1;
		if(i < 0 || i >= 3) 
		{
			op.wrongInput();
			return money;
		}
		if(money < price[i]) 
		{
			op.failedBuy();
			return money;
		}
		money -= price[i];
		buyNum[i]++;
		op.successBuy(money, juice[i]);
		return money;
	}
	
	public void buyNums()
	{
		for(int i = 0; i < juice.length; i++)
		{
			System.out.print(juice[i] + " : " + buyNum[i]);
			if(i != juice.length -1) {System.out.print(", ");}
		}
	}
}
