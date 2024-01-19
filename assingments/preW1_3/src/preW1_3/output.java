package preW1_3;

public class output {
	
	public void inputMoney()
	{
		System.out.print("금액을 투입해주세요 : ");
	}
	
	public void buyingJuice()
	{
		System.out.print("무엇을 구매하시겠습니까 : ");
	}
	
	public void wrongInput()
	{
		System.out.println("입력은 1~3 혹은 종료하실경우의 -1만 입력 가능합니다."); 
	}
	public void failedBuy()
	{
		System.out.println("구매에 실패하였습니다.");
	}
	public void successBuy(int money, String juice)
	{
		System.out.println(juice + "구매에 성공하셨습니다.");
		System.out.println("남은 금액은 : " + money + "입니다.");
	}
}
