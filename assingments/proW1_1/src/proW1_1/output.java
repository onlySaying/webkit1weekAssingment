package proW1_1;

public class output {

	void inputNum(int i)
	{
		System.out.print(i+"번째 숫자를 넣으세요.( 50이하의 숫자) : ");
	}
	//연산자는 덧셈, 뺄셈, 곱셈, 나눗셈을 입력받을 수 있어야 된다.
	//조건-반복문(while)을 사용하여 연산자 입력 부분에 'q'를 입력하면 종료되도록 한다.
	void inputCalc()
	{
		System.out.println("연산자를 입력하세요(+,-,*,/). 만약 종료를 원하신다면 q를 입력하세요.");
	}
}
