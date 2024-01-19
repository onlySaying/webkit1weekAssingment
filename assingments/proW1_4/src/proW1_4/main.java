package proW1_4;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPerson cp = new CPerson(01000000000, "hoju", 25, "deagu");
		
		cp.printPerson();
		
		cp.setName("ddd");
		cp.setAddress("gumi");
		cp.setAge(29);
		cp.setNumber(01011112222);
		
		cp.printPerson();
		
	}

}
