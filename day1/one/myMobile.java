package day1.one;

public class myMobile {
	
	private void callMethod(){
		System.out.println("This is to Test");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mobile n=new mobile();
		
		String checkOperator = n.checkOperator("Airtel");
		
		System.out.println(checkOperator);
		
		n.sendMessage();
		
		int chargeMobile=n.checkCharge();
		
		System.out.println(chargeMobile);
		
		System.out.println(n.charge);
		n.saveContact("+919791662996");
		n.saveContact1("+91979848762997");
		n.savecontact2("Murali");
		n.savecontact2("Ramesh");
		n.savecontact3("Murali");
		n.savecontact3("rahul");
	}

}
