package proW1_2;

public class output {

	//(2) switch문을 사용하여 메뉴 선택이 가능하도록 하고, 메뉴 종류는 아래와 같다.
    //ex) [1].구구단 실행, [2].도움말 등으로 설정한다.
	void menu()
	{
		System.out.println("메뉴를 선택해주세요.");
		System.out.print("[1].구구단 실행, [2].도움말 : ");
	}
	void help()
	{
		System.out.println("이상기 2024-01-14");
	}
	void table()
	{
		for(int i = 2; i < 10; i++)
		{
			for(int j = 1; j < 10; j++)
			{
				System.out.print(i + "*" + j +"=" + (i*j) +" ");
			}
			System.out.println();
		}
	}
}
