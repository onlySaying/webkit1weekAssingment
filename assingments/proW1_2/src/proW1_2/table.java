package proW1_2;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		output op = new output();
		input ip = new input();
		int choice = 0;
		do 
		{
			op.menu();
			choice = ip.inputMenu();
			switch(choice)
			{
			case 1 : 
				op.table();
				break;
			case 2 :
				op.help();
				break;
			default :
				
			}
			
		}while(choice != 1);
	}

}
